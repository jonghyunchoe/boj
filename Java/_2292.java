import java.util.Scanner; 

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 

        int rooms_crossed = 1; 
        int interval = 6;
        N -= 1;
        while (N > 0) {
            N -= interval; 
            rooms_crossed++; 
            interval += 6; 
        }
        System.out.println(rooms_crossed);

        // 1 (1) - 1
        // 2 ~ 7 (6) - 2
        // 8 ~ 19 (12) - 3
        // 20 ~ 37 (18) - 4
        // 38 ~ 61 (24) - 5 
    }
}
