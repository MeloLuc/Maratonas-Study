package collectionDemo.QueueDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo01 {

    public static void main(String[] args) {

        PriorityQueue pQueue = new PriorityQueue();

        // Adding Elements  add()  offer()
        pQueue.add("A");
        pQueue.add("B");
        pQueue.add("C");
        pQueue.offer("C");
        pQueue.add("A");
        pQueue.add("B");
        pQueue.add("C");
        pQueue.offer("C");

        System.out.println("PriorityQueue: " + pQueue); //insertion order preserved?? & duplicates allowed

        // get head element  element()  peek()
        System.out.println("head element, element(): " + pQueue.element()); //exception
        System.out.println("head element, peek(): " + pQueue.peek()); //null

        // return and remove element from queue  remove()  poll()
        System.out.println("Removing: " + pQueue.remove()); //exception
        System.out.println(pQueue);

        System.out.println("Removing: " + pQueue.poll()); //null
        System.out.println(pQueue);

        Iterator it = pQueue.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(Object o : pQueue) {
            System.out.println(o);
        }


    }

}
