import java.util.Scanner; 
import java.util.ArrayList; 

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++)
            numbers[i] = sc.nextInt(); 
        
        int count = 0;
        for (int i=0; i<N; i++) {
            boolean is_prime = true; 
            for (int j=2; j<=numbers[i]/2; j++) {
                if (numbers[i] != j && numbers[i] % j == 0) {
                    is_prime = false;
                    break; 
                }
            }
            if (numbers[i] != 1 && is_prime) {
                count++;
            }
        }
        System.out.println(count); 
    }
}