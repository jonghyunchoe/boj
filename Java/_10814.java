import java.util.Scanner;
import java.util.Arrays; 

public class _10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Player[] players = new Player[N];
        for (int i=0; i<N; i++) {
            Player player = new Player();
            player.age = sc.nextInt();
            player.name = sc.nextLine();
            player.order = i;
            players[i] = player;
        }

        Arrays.sort(players, (a, b) -> {
            if (a.age > b.age || (a.age == b.age && a.order > b.order)) 
                return 1;
            else 
                return -1;
        });
        for (int i=0; i<N; i++) {
            System.out.println(players[i].age + players[i].name);
        }
    }
}

class Player {
    int age; 
    String name; 
    int order; 
}
