package CollectionsChapter17.chapter17;

import java.util.function.BiConsumer;

public class BiconsumerExampple {
    public static void main(String[] args) {

        BiConsumer<String, String> name = (name1, name2) ->  {
            System.out.println("my first name is "+ name1 + " second name is "+ name2);
        };

        name.accept("John","Mandi");

        BiConsumer<String ,Integer > calculateAge = (nameOf, age)->{
            System.out.println("my name is "+ nameOf + " and my  age is "+ age);
        };
        calculateAge.accept("Mary", 19);


    }}