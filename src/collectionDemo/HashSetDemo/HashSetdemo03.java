package collectionDemo.HashSetDemo;

import java.util.HashSet;

public class HashSetdemo03 {

    public static void main(String[] args) {

        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println("set1: " + set1 + "\nset2: " + set2);

        // subSet
        System.out.println("set2 is subset of set 1: " + set1.containsAll(set2));

        // Intersection
        set1.retainAll(set2);
        System.out.println("Intersection set1 with set 2:" + set1);

        // Union
        set1.addAll(set2);
        System.out.println("Union set1 with set 2:" + set1);

        // Difference
        set1.removeAll(set2);
        System.out.println("Difference set1 with set 2:" + set1);


    }

}
