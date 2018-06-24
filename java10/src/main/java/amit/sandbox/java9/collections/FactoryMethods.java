package amit.sandbox.java9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FactoryMethods {
    public static void main(String[] args) {
        //New
        List<String> immutableList = List.of("One", "Two");
        System.out.println(immutableList);
        //immutableList.add("Three"); //Runtime error Throws UnsupportedOperationException

        //Old
        List<String> oldImmutableList = Collections.unmodifiableList(Arrays.asList("One", "Two"));
        System.out.println(oldImmutableList);


        Map<Integer, String> immutableMap = Map.of(1, "One", 2, "Two");
        System.out.println(immutableMap);
        //immutableMap.put(3, "Three");//Runtime error Throws UnsupportedOperationException
    }
}
