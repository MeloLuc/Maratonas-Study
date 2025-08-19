package collectionDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class arrayListDemo01 {

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




    }

}
