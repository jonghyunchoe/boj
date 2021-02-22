import java.util.Scanner; 
import java.util.Stack; 

public class _10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int number;
        for (int i=0; i<N; i++) {
            String input = sc.next();
            if (input.equals("push")) {
                stack.push(sc.nextInt());
            }
            else if (input.equals("pop")) {
                if (stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            }
            else if (input.equals("size")) {
                System.out.println(stack.size());
            }
            else if (input.equals("empty")) {
                if (stack.empty())
                    System.out.println(1);
                else 
                    System.out.println(0);
            }
            else if (input.equals("top")) {
                if (stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }
        sc.close(); 
    }
}
