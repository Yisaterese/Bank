package Chapter17.Streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperation {
    public static List<Integer> getEvenNumbersOf(List<Integer> numbers) {
      return  numbers.stream()
              .filter((number)->number % 2 == 0)
              .collect(Collectors.toList());

    }
    public static List<Integer> getEvenNumbersOf1(List<Integer> numbers) {
        return  numbers.stream()
                .filter((number)->number % 2 == 0)
                .collect(Collectors.toCollection(()->new LinkedList<>()));

    }

    public static Map<Integer, String > mapCodePointToCharacter(List<Integer> codePoints){
       return codePoints.stream()
                .collect(Collectors.toMap((codePoint)->codePoint,Character::toString));

    }

}
