package app;

import entities.Palindrome1;

public class Solutions {
    public static void main(String[] args) {
        //primeira solução.
        Palindrome1 p1 = new Palindrome1();
        System.out.printf("p1: %b", p1.isPalindrome(-121));
        System.out.printf("\np1: %b", p1.isPalindrome(112211));
    }
}
