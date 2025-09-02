package collectionDemo.LinkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList new_l = new LinkedList();
        new_l.addAll(l);
        System.out.println("addAll(): " + new_l);

        new_l.removeAll(l);
        System.out.println("removeAll(): " + new_l);

        System.out.println("Before sorting: " + l);
        Collections.sort(l);
        System.out.println("After sorting: " + l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse Order: " + l );

        Collections.shuffle(l);
        System.out.println("After shuffling: " + l);
    }

}
