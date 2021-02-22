import java.util.Scanner; 
import java.util.Stack; 

public class _9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        while (sc.hasNext()) {
            String input = sc.nextLine(); 
            Stack<Character> stack = new Stack<Character>(); 
            boolean vps = true; 
            for (int i=0; i<input.length(); i++) {
                if (input.charAt(i) == '(') {
                    stack.push('(');
                }
                else if (input.charAt(i) == ')') {
                    if (stack.empty()) {
                        vps = false; 
                        break; 
                    }   
                    else 
                        stack.pop(); 
                }
            }
            if (!stack.empty() || !vps)
                System.out.println("NO");
            else 
                System.out.println("YES");
        }

        sc.close(); 
    }
}
