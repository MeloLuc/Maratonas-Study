package questions.queueStackQuestions.exe01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome1 {

    public boolean isPalindrome(int x) {

        Deque<Character> pilha = new ArrayDeque<>();
        Deque<Character> fila = new ArrayDeque<>();

        String xs = String.valueOf(x);

        for (char c: xs.toCharArray()) {
            pilha.addFirst(c);
            fila.addLast(c);
        }

        while (!fila.isEmpty()) {
            if(fila.removeFirst() != pilha.removeFirst()){
                return false;
            }
        }
        return true;
    }

}
