package Chapter17.Streams;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

import static Chapter17.Streams.StreamOperation.getEvenNumbersOf;
import static Chapter17.Streams.StreamOperation.mapCodePointToCharacter;

public class StreamOperationTest {
    @Test
    public void getEvenNumbersTest(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = getEvenNumbersOf(numbers);

        Assertions.assertNotNull(evenNumbers);
        Assertions.assertEquals(5, evenNumbers.size());
    }

    @Test
    public void mapCodePointToCharacterTest(){
        List<Integer> numbers = List.of(65,97,98,66,69,48);

        Map<Integer, String> map = mapCodePointToCharacter(numbers);
        Map<Integer, String> expected = Map.of(65,"A",
                                            97,"a",
                                            98,"b",
                                            66,"B",
                                            69,"E",
                                            48,"0");
        Assertions.assertNotNull( map);
        Assertions.assertEquals(expected,map);

    }
}
