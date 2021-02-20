import java.util.Scanner; 

public class _18111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt();
        int B = sc.nextInt();
        int[][] input = new int[N][M]; 
        for (int i=0; i<N; i++) 
            for (int j=0; j<M; j++) 
                input[i][j] = sc.nextInt();
        
        // If higher, takes 2 * time 
        // If lower, takes 1 * time
        // Take account of available blocks 
    }  
}
