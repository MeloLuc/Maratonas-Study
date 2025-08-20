package collectionDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo01 {

    public static void main(String[] args) {

        //declare ArrayList
        ArrayList al1 = new ArrayList(); //Heterogeneous Data
        ArrayList <Integer> al2 = new ArrayList<>(); //Homogeneous Data
        ArrayList <String> al3 = new ArrayList<>();
        List al4 = new ArrayList();
        List <Integer> al5 = new ArrayList<>();

        //Add new Elements to the arrayList
        al1.add(100); //Heteregeneous Data
        al1.add("Lucas");
        al1.add(15.6);
        al1.add('L');
        al1.add(true);
        System.out.println("ArrayList inicialize: " + al1);

        //Size
        System.out.println("Number of elements in ArrayList: " + al1.size());

        //remove
        al1.remove(2);
        al1.remove((Character)'L');
        System.out.println("After removing elements from ArrayList: "+ al1);

        //Insert a new element
        al1.add(0, "First");
        al1.add("Last");
        System.out.println("After insertion: " + al1);

        //retrieve specific element
        System.out.println(al1.get(1));

        //change/replace element
        al1.set(3, false);
        System.out.println("After replacing element: " + al1);

        //search - contains() - return true or false
        System.out.println("contains 'Lucas': " + al1.contains("Lucas"));
        System.out.println("contains 'Luca': " + al1.contains("Luca"));

        //is Empty
        System.out.println("ArrayList is empty: " + al1.isEmpty());

        // for loop
        System.out.println("Reading elements using for loop:");
        for(int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        for(int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i));

            if (i < al1.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //for each loop
        System.out.println("Reading elements using for each loop");
        for(Object e : al1) {
            System.out.println(e);
        }

        for(Object e : al1) {
            System.out.print(e);

            if(!e.equals(al1.getLast())) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //iterator()
        System.out.println("Reading elements using iterator method");
        Iterator it = al1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //stream(
        System.out.println("Reading elements using stream:");
        var elements = al1.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(elements);

        //String.join()
        //System.out.println("Reading elements using String.join()");
        //String elements = String.join(", ", al1); //need be string
        //System.out.println(elements);

    }

}
