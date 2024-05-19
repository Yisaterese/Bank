package CollectionsChapter17.chapter17;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (string1, string2) -> string1.concat(string2);
        System.out.println(binaryOperator.apply("Hello", "World"));

        BinaryOperator<Integer> binaryOperator1 = (num1, num2) -> num1 * num2;
        System.out.println(binaryOperator1.apply(3,5));
    }
}
