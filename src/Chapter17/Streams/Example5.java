package Chapter17.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);

        // sum of numbers
     var stats = list.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .sum();
        System.out.println(stats);

        //maximum number
        var stat = list.stream()
                .flatMapToInt((element) -> IntStream.of(element * 2))
                .max().getAsInt();
        System.out.println(stat);


    }
}
