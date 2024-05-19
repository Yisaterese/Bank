package CollectionsChapter17.chapter17;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, Boolean> predicate = (name1,name2) -> name1.equals(name2);
        System.out.println(predicate.test("name1", true));

        BiPredicate<Integer, Integer> predicate1 = (num, num1) -> num.equals(num1);
        System.out.println(predicate1.test(3,3));


        BiPredicate<Integer,Boolean> predicate2 = (number1, number2) -> number1 % 2 == 0;
        System.out.println(predicate2.test(4,true));

    }
}
