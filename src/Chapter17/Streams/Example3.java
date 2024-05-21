package Chapter17.Streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);

        System.out.print(list.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .average()
                .orElseThrow(() ->new RuntimeException("Element not present")));


    }
}
