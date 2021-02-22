import java.util.Scanner;
import java.util.Stack; 

public class _4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        while (true) {
            String input = sc.nextLine();
            while (input.charAt(input.length()-1) != '.')
                input = input.concat(sc.nextLine());
            if (input.equals("."))
                break; 
            boolean balanced = true;
            for (int i=0; i<input.length(); i++) {
                if (input.charAt(i) == '(' || input.charAt(i) == '[')
                    stack.push(input.charAt(i));
                else if (input.charAt(i) == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        balanced = false;
                        break; 
                    }
                    else 
                        stack.pop();
                }
                else if (input.charAt(i) == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        balanced = false;
                        break; 
                    }
                    else 
                        stack.pop(); 
                }
            }
            if (balanced && stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");
            stack.clear(); 
        }
        sc.close(); 
    }
}