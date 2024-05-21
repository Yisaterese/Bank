package Chapter17.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {


                List<String> list = List.of(
                       "ABCD,HELLO,HEY");

                System.out.println(list.stream()
                        .flatMap((element) -> Stream.of(new StringBuilder(element).reverse()))
                        .toList());



    }
}
