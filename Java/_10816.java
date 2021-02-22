import java.util.Scanner; 
import java.util.HashMap; 

public class _10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<N; i++) {
            int number = sc.nextInt(); 
            map.put(number, map.getOrDefault(number, 0)+1);
        }
        int M = sc.nextInt(); 
        for (int i=0; i<M; i++) 
            System.out.print(map.getOrDefault(sc.nextInt(), 0) + " "); 
        sc.close();
        
        // Use linked list and binary search to tackle time issue
    }
}
