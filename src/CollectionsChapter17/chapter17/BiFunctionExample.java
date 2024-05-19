package CollectionsChapter17.chapter17;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<String, String, Boolean> names = (fruit, fruits) -> fruits.equals(fruit);

        System.out.println(names.apply("apple", "apple"));


//        BiFunction<Integer, Double, Boolean> currency = (naira, money) -> {
//            return money * naira;
//        };
//        currency.apply("apple", "apple");
    }
}