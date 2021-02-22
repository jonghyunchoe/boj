import java.util.Scanner; 

public class _7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        int[][] size = new int[N][2]; 
        for (int i=0; i<N; i++) {
            size[i][0] = sc.nextInt();
            size[i][1] = sc.nextInt(); 
        }

        int[] rank = new int[N]; 

        for (int i=0; i<N; i++) {
            int current_rank = 1;
            for (int j=0; j<N; j++) {
                if (i != j && size[i][0] < size[j][0] && size[i][1] < size[j][1]) 
                    current_rank++; 
            }
            rank[i] = current_rank; 
        }

        for (int e : rank) 
            System.out.println(e); 
        sc.close();
    }
}
