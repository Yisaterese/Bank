package CollectionsChapter17.chapter17;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {
    public static void main(String[] args) {
        DoubleBinaryOperator b = Double::max;
        System.out.println(b.applyAsDouble(1.0, 2.0));
    }
}
