import java.util.Scanner;
import java.util.Arrays;

public class _11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        Coordinate[] coords = new Coordinate[N];
        for (int i=0; i<N; i++) {
            Coordinate coord = new Coordinate();
            coord.x = sc.nextInt();
            coord.y = sc.nextInt();
            coords[i] = coord; 
        }

        Arrays.sort(coords, (a, b) -> {
            if (a.y > b.y) 
                return 1; 
            else if (a.y == b.y && a.x > b.x) 
                return 1;
            else 
                return -1;
        });

        for (int i=0; i<N; i++) {
            System.out.println(coords[i].x + " " + coords[i].y);
        }
    }
}

class Coordinate {
    int x;
    int y;
}