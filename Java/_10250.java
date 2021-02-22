import java.util.Scanner; 

public class _10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int T = sc.nextInt();
        int[][] rooms = new int[T][3];
        for (int i=0; i<T; i++) {
            rooms[i][0] = sc.nextInt();
            rooms[i][1] = sc.nextInt();
            rooms[i][2] = sc.nextInt(); 
        }
        
        int floor = 0;
        int room_number = 0;

        for (int i=0; i<T; i++) {
            if (rooms[i][2] % rooms[i][0] == 0) {
                floor = rooms[i][0];
                room_number = rooms[i][2] / rooms[i][0]; 
            }
            else { 
                floor = rooms[i][2] % rooms[i][0];
                room_number = rooms[i][2] / rooms[i][0] + 1;
            }
            System.out.println(floor * 100 + room_number);
        }
    }
}
