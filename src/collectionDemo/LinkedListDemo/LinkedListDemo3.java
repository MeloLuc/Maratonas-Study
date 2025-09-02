package collectionDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();

        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        System.out.println(l);

        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println(l);

        System.out.println("First Element: " + l.getFirst());
        System.out.println("Last Element: " + l.getLast());

        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }

}
