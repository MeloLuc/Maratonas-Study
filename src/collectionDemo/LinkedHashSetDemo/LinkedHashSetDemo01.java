package collectionDemo.LinkedHashSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {

    public static void main(String[] args) {

        LinkedHashSet <Integer> lset = new LinkedHashSet<>(); //default size, load factory ...
        HashSet <Integer> hs = new HashSet<>();

        lset.add(100);
        lset.add(300);
        lset.add(600);
        lset.add(500);

        hs.add(100);
        hs.add(300);
        hs.add(600);
        hs.add(500);

        System.out.println(lset); // insertion order (v)
        System.out.println(hs); // insertion order (x)

        // Same methods of HashSet
    }

}
