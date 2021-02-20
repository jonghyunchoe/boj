import java.util.Scanner; 
import java.util.Arrays;
import java.util.LinkedList; 

public class _11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] sequence = new int[N];
        LinkedList<Integer> circle = new LinkedList<Integer>();
        for (int i=1; i<=N; i++) 
            circle.add(i);

        int position = K; 
        for (int i=0; i<N; i++) {
            sequence[i] = circle.remove(position-1);
            position += K-1;  
            while (position > circle.size() && circle.size() != 0) {
                position -= circle.size();  
            }
        }
        System.out.print("<");
        for (int i=0; i<N-1; i++) {
            System.out.print(sequence[i]);
            System.out.print(", ");
        }
        System.out.print(sequence[N-1]);
        System.out.println(">");
    }
}
