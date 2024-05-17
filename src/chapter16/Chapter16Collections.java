package chapter16;

import java.util.*;

public class Chapter16Collections {
    public static void main(String[] args) {
        boolean b = true;
        Boolean b2 = b;
        System.out.println(b);
        System.out.println(b2);
        //does not take duplicate
        Collection<String> words = new TreeSet<>();
        words.add("t");
        words.add("r");
        words.add("e");
        words.add("e");
        System.out.println(words);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        System.out.println(numbers);
        //does not take duplicate
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(3);
        System.out.println(numbers2);
        Set<List<Integer>> numbers3 = new HashSet<>();
        numbers3.add(Collections.singletonList(1));
        numbers3.add(Collections.singletonList(2));
        numbers3.add(Collections.singletonList(3));
       // numbers3.add(3);
        System.out.println(numbers3);


    }
}
