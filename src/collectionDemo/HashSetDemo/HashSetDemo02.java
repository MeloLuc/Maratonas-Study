package collectionDemo.HashSetDemo;

import java.util.HashSet;

public class HashSetDemo02 {

    public static void main(String[] args) {

        HashSet <Integer> evenNumber = new HashSet<>();

        evenNumber.add(100);
        evenNumber.add(5);
        evenNumber.add(6);
        System.out.println("HashSet evenNumber: " +  evenNumber);

        HashSet <Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(1);
        System.out.println("HashSet numbers: " +  numbers);

        numbers.removeAll(evenNumber);
        System.out.println("remove eveNumber into numbers: " + numbers);

    }

}
