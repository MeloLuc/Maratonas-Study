package collectionDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo02 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("X");
        al.add("A");
        al.add("V");
        al.add("F");
        al.add("K");
        al.add("Y");

        //add a colection in arrayList
        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);

        System.out.println(al);
        System.out.println(al_dup);

        //remove a collection/group in arraylist
        al_dup.removeAll(al);
        System.out.println("After removing all: " + al_dup);

        //sort  --- Collections.sort()
        System.out.println("Elements in the arraylist: " + al);
        Collections.sort(al);
        System.out.println("Elements after sorting: " + al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements after sorting in reverse order: " + al);

        //shuflling --- Collection.shuffle()
        Collections.shuffle(al);
        System.out.println("After shuffling: " + al);

    }

}
