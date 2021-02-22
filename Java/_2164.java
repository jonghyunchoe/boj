import java.util.Scanner; 
import java.util.LinkedList; 

public class _2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        LinkedList<Integer> deck = new LinkedList<Integer>();
        for (int i=1; i<=N; i++)
            deck.add(i);
        
        while (deck.size() != 1) {
            deck.removeFirst();
            deck.addLast(deck.removeFirst());
        }
        System.out.println(deck.get(0));
    }
}
