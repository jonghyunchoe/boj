import java.util.Scanner;

public class _2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt();
        int[] tree_heights = new int[N];
        int max = 0;
        for (int i=0; i<N; i++) {
            tree_heights[i] = sc.nextInt();
            if (max < tree_heights[i]) 
                max = tree_heights[i];
        }

        int low = 0;
        int high = max; 
        long prev_sum = 0;
        int prev_mid = 0;  
        boolean height_found = false;
        boolean check = false; 
        while (height_found == false) {
            int mid = (low + high) / 2;
            long sum = 0;
            for (int i=0; i<N; i++) {
                if ((tree_heights[i] - mid) > 0) {
                    sum += tree_heights[i] - mid;
                }
            }
            if (sum >= M) {
                low = mid;
                if (check == false) {
                    check = true;
                    prev_sum = sum;
                    prev_mid = mid; 
                }
                else if (sum < prev_sum) {
                    prev_sum = sum;
                    prev_mid = mid;
                }
                else if (sum >= prev_sum) {
                    System.out.println(prev_mid); 
                    height_found = true;
                }
            }
            else if (sum <= M)
                high = mid;  

        }
    }
}
