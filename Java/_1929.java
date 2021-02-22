import java.util.Scanner; 

public class _1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt(); 
        for (int i=M; i<=N; i++) {
            boolean is_prime = true; 
            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    is_prime = false;
                    break; 
                }
                if (j > i/2 && i >= 5) {
                    break; 
                }
            }
            if (is_prime) 
                System.out.println(i); 
        }
        sc.close();
    }
}
