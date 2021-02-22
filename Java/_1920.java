import java.util.Scanner;
import java.util.HashSet; 

public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<N; i++) 
            set.add(sc.nextInt());
        int M = sc.nextInt(); 
        for (int i=0; i<M; i++) {
            int number = sc.nextInt();
            if (set.contains(number))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
