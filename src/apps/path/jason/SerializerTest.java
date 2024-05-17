package apps.path.jason;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static apps.path.jason.Gender.FEMALE;
import static apps.path.jason.Serializer.serialise;

public class SerializerTest {
    @Test
    public void testSerialise(){
        Person person =  new Person();
        person.setName("Bob");
        LocalDate dateOfBirth = LocalDate.of(2024,4,5);
        person.setDateOfBirth(dateOfBirth);
        person.setGender(FEMALE);
        person.setPhoneNumber("08023578906");
        String json = serialise(person);
        String expected = "{\"name\":\"Bob\",\"gender\":\"FEMALE\",\"phoneNumber\":\"08023578906\",\"dateOfBirth\":\"[2024,4,5]\"}";
        Assertions.assertEquals(expected,json);
    }

    @Test
    public void deserializeTest() {

        Person person = new Person();
        person.setName("Bob");
        LocalDate dateOfBirth = LocalDate.of(2024, 3, 3);
        person.setDateOfBirth(dateOfBirth);
        person.setGender(FEMALE);
        person.setPhoneNumber("08023578906");
        String json = serialise(person);
        Person personFromJson = Serializer.deserialize(json);

        Assertions.assertNotNull(personFromJson);
        Assertions.assertEquals(person.getDateOfBirth(),personFromJson.getDateOfBirth());
        Assertions.assertEquals(FEMALE,personFromJson.getGender());
        Assertions.assertEquals("Bob",personFromJson.getName());
        Assertions.assertEquals("08023578906",personFromJson.getPhoneNumber());


    }
}
