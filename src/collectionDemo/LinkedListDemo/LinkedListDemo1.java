package collectionDemo.LinkedListDemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        //Declare LinkedList
        LinkedList l = new LinkedList(); //hetereogeneous data
        LinkedList <Integer> lInt = new LinkedList<>(); //homogeneous data
        LinkedList <Object> lObj = new LinkedList<>();

        //Add Elements into LinkedList -> .add(obj)
        l.add(100);
        l.add(15.5);
        l.add("Lucas");
        l.add('M');
        l.add(true);
        l.add(false);
        l.add(null);

        lInt.add(1);
        lInt.add(3);
        lInt.add(5);
        lInt.add(7);
        //lInt.add(15.5);

        lObj.add(100);
        lObj.add(15.5);
        lObj.add("Lucas");
        lObj.add('M');
        lObj.add('M');
        lObj.add(true);
        lObj.add(false);
        lObj.add(null);

        System.out.println("Heterogeneous Elements from linkedlist (l):\n "+ l +"Size: " + l.size());
        System.out.println("homogeneous Elements from linkedlist (lInt):\n "+ lInt +"Size: " + lInt.size());
        System.out.println("(lObj): "+ lObj +". Size: " + lObj.size());


        //Inserting/Add Element in the middle of the linked list -> .add(index, obj)
        l.add(4, "middle");
        lInt.add(2, 0);
        lObj.add(4, 5);

        System.out.println("\nLinked List after insertion with parameter index:\n(l): " + l + "\n(lInt): " + lInt + "\n(lObj): " + lObj);


        //Insertion/Add colection in a LinkedList -> .addAll(Colection)
        l.addAll(lInt);
        l.addAll(lObj);
        System.out.println("\nLinkedList (l) after insertion of (lInt) and (lObj): " + l);


        //Retriving Value/Object -> .get(index)
        System.out.println("index 3 of (l):" + l.get(3));

        //Changing the value -> .set(index, obj)
        l.set(3, "Changed");
        System.out.println("Value of index 3 changed: " + l);

        //Contains()
        System.out.println("\nContains():");
        System.out.println(l.contains("Java"));
        System.out.println(l.contains(5));
        System.out.println(l.contains("Lucas"));

        //IsEmpty()
        System.out.println("\nIsEmpty:");
        System.out.println(l.isEmpty());

        //Reading Elments from LinkdeList using loop
        System.out.println("\nloop for:");
        for(int i=0; i<l.size(); i++) {
            System.out.print(l.get(i));
            if(i < l.size() - 1) {
                System.out.print(", ");
            }

        }

        System.out.println("\nloop for each:");
        for (Object o : l) {
            System.out.println(o);
        }

        Object lStream = l.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Stream: " + lStream);

        //iterator()
        System.out.println("\niterator method in linkedList:");
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
