import java.util.Scanner; 

public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt(); 
        int numerator = 1;
        int denominator = 1;
        for (int i=1; i<=N; i++) {
            numerator *= i;
        }
        for (int i=1; i<=(N-K); i++) {
            denominator *= i;
        }
        for (int i=1; i<=K; i++) {
            denominator *= i;
        }
        System.out.println(numerator / denominator);
    }
}
