package collectionDemo.HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class HashSetDemo01 {

    public static void main(String[] args) {

        HashSet hs = new HashSet(); //default capacity is 16, Load Factor is 0.75
        HashSet hsCapacity = new HashSet(100); //capacity is 100, Load Factor is 0.75
        HashSet hsCapacityLFactor = new HashSet(100, (float) 0.95); //capacity is 100, Load Factor is 0.95
        HashSet <String> hsString = new HashSet<>();
        HashSet <Integer> hsInteger = new HashSet<>();

        // Add objects/elements into HashSet
        // duplicate (x), insertion order preserved (x)
        hs.add(100);
        hs.add("Welcome");
        hs.add(16.5);
        hs.add("L");
        hs.add(true);
        hs.add(null);
        System.out.println("Objects/Elements added: " + hs);

        // Remove
        // No index concept
        hs.remove(16.5);
        System.out.println("After remove Object/Element: " + hs);

        // Contains
        System.out.println("Contains 'welcome' " + hs.contains("Welcome"));
        System.out.println("Contains 'wsd' " + hs.contains("wsd"));

        // IsEmpty
        System.out.println("isempty" + hs.isEmpty());

        // Reading
            // For each
        System.out.println("\nFor each:");
        for(Object o : hs) {
            System.out.println(o);
        }

            // Stream
        Object readingStream = hs.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("\nStream collect: " + readingStream);

            //Iterator
        System.out.println("\nIterator: ");
        Iterator it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
