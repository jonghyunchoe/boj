import java.util.Scanner;

public class _1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Change int to long 
        int K = sc.nextInt();
        long N = sc.nextInt();
        int[] wires = new int[K];
        int max = 0;
        for (int i=0; i<K; i++) {
            wires[i] = sc.nextInt();
            if (wires[i] > max) 
                max = wires[i];
        }
    }
}