// Name: Darsh Iyer
// Date: 13 February, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: none

package java20230731.java20230731.java20230731;

public class Quiz14 {
    public static void main(String[] arg166) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1); stack.push(8);  stack.push(7);  stack.push(2); 
        stack.push(9); stack.push(18); stack.push(2*58); stack.push(0); 
        
        System.out.println("bottom " + stack.toString() + " top");
        removeEvenNumbers(stack);
        System.out.println("bottom " + stack.toString() + " top");
    } 
    
    public static void removeEvenNumbers(Stack<Integer> s) {
        Stack<Integer> auxStack1 = new Stack<Integer>();
        Stack<Integer> auxStack2 = new Stack<Integer>();
        
        while (!s.empty()) {
            auxStack1.push(s.pop());
        }
        
        while (!auxStack1.empty()) {
            int num = auxStack1.pop();
            if (num % 2 != 0) {
                auxStack2.push(num);
            }
        }
        
        while (!auxStack2.empty()) {
            s.push(auxStack2.pop());
        }
    }
    
        
}
