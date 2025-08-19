package queueStackQuestions.exe02;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main (String[] args) {
        String s = "(()){[";
        System.out.println(isValid(s));
        System.out.println(isValidd(s));
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> pares = new HashMap<>();
        pares.put(')', '(');
        pares.put('}', '{');
        pares.put(']', '[');

        for (char c : s.toCharArray()) {
            if(pares.containsKey(c)){
                if(stack.isEmpty() || !stack.removeFirst().equals(pares.get(c))){
                    return false;
                }
            }
            else{
                stack.addFirst(c);
            }
        }

        return stack.isEmpty();
    }

    //melhor tempo
    public static boolean isValidd(String s) {
        char[] chars = s.toCharArray();
        char[] brackets = new char[s.length()];
        int stackTop = -1;

        for(int i =0 ; i < s.length() ; i++){
            if(chars[i] == '{' || chars[i] == '(' || chars[i] == '['){
                stackTop++;
                brackets[stackTop] = chars[i];

            }
            else if (stackTop < 0
                    && (chars[i] == '}'
                    || chars[i] == ')'
                    || chars[i] == ']')
            ) {
                return false;
            }
            else if (stackTop > -1
                    && ((chars[i] == '}' && brackets[stackTop] != '{')
                    || (chars[i] == ')' && brackets[stackTop] != '(')
                    || (chars[i] == ']' && brackets[stackTop] != '['))){
                return false;
            }
            else if (stackTop > -1
                    && ((chars[i] == '}' && brackets[stackTop] == '{')
                    || (chars[i] == ')' && brackets[stackTop] == '(')
                    || (chars[i] == ']' && brackets[stackTop] == '['))){
                stackTop--;
            }
        }
        if(stackTop == -1){
            return true;
        }
        else {
            return false;
        }

    }
}
