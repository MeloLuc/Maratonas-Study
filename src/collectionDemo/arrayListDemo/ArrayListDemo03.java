package collectionDemo.arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo03 {

    public static void main(String[] args) {

        String[] arr = {"Dog", "Cat", "elephant"}; //inicializing array with elements

        for (String value:arr) {
            System.out.println(value);
        }

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println("ArrayList create from array (Arrays.toList):" + al);

    }

}
