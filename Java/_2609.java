import java.util.Scanner; 

public class _2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int gcd = 0;
        int lcm = 0;
        for (int i=1; i<=Math.min(A, B); i++) {
            if (A%i == 0 && B%i == 0)  
                gcd = i; 
        }

        for (int i=1; i<=B; i++) {
            int A_multiple = A * i;
            int B_multiple = 0; 
            for (int j=1; j<=A; j++) {
                B_multiple = B*j; 
                if (A_multiple == B_multiple) 
                    lcm = A_multiple;
            }
            if (lcm != 0) 
                break;
        }
        System.out.println(gcd);
        System.out.println(lcm); 
        sc.close();
    }
}
