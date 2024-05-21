package Chapter17.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);

        System.out.print(list.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .min()
                .orElseThrow(() ->new RuntimeException("Element not present")));


        System.out.print(list.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .summaryStatistics().getAverage());


    }
}
