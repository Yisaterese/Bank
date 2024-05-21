package Chapter17.FunctionalInterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {

        BooleanSupplier booleanSupplierExample = ()-> true;
        System.out.println(booleanSupplierExample.getAsBoolean());

        BooleanSupplier booleanSupplierExample1 = ()-> 2 > 3;
        System.out.println(booleanSupplierExample1.getAsBoolean());

        BooleanSupplier booleanSupplierExample2 = ()-> 2 * 3 == 6;
        System.out.println(booleanSupplierExample2.getAsBoolean());

    }
}
