package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    public boolean isPalindrome(String text) {
        
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleanText.length(); i++) {
            char c = cleanText.charAt(i);
            queue.add(c);  // Almacena en orden normal (FIFO)
            stack.push(c); // Almacena en orden inverso (LIFO)
        }

        while (!queue.isEmpty()) {
            char charFromQueue = queue.poll();
            char charFromStack = stack.pop();

            if (charFromQueue != charFromStack) {
                return false; 
            }
        }

        return true;
    }
}
