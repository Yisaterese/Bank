package apps.path.jason;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;
    @JsonProperty("dateOfBirth;")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Gender gender;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private  String phoneNumber;

    public Person(){}
    public Person(String name, LocalDate dateOfBirth,String phoneNumber,Gender gender ){
        this.name= name;
        this.gender = gender;
        this.dateOfBirth= dateOfBirth;
        this.phoneNumber = phoneNumber;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender sex) {
        this.gender = sex;
    }

}
