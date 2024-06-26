package Chapter17.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println("my name is "+ name);
        consumer.accept("John");
    }
}
