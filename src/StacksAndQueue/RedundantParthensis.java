package StacksAndQueue;

import java.util.Stack;

public class RedundantParthensis {

	public static void main(String[] args) {
		
		
		String s ="(((a+(b))+(c+d)))";
		  // create a stack of characters  
        Stack<Character> Stack = new Stack<>(); 

        // Iterate through the given expression  
        char[] str = s.toCharArray(); 
        for (char ch : str) { 
            // if current character is close parenthesis ')'  
            if (ch == ')') { 
                // pop character from the stack  
                char top = Stack.peek(); 
                Stack.pop(); 

                // stores the number of characters between a  
                // closing and opening parenthesis  
                // if this count is less than or equal to 1  
                // then the brackets are redundant else not  
                int elementsInside = 0; 
                while (top != '(') { 
                    elementsInside++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                if (elementsInside < 1) { 
                    System.out.println("Invalid");
                } 
            } // push open parenthesis '(', operators and  
            // operands to stack  
            else { 
                Stack.push(ch); 
            } 
        } 

        // No duplicates found  
        System.out.println("Valid");
	}
}
