import java.util.Scanner; 
import java.util.ArrayList; 

public class _2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[N];
        for (int i=0; i<N; i++) 
            cards[i] = sc.nextInt();
        
        ArrayList<Integer> cards_sum = new ArrayList<Integer>(); 
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<N; k++) {
                    if (cards[i] != cards[j] && cards[j] != cards[k] && cards[i] != cards[k]) {
                        cards_sum.add(cards[i] + cards[j] + cards[k]);
                    }
                }
            }
        }

        int max = 0; 
        for (int i=0; i<cards_sum.size(); i++) {
            if (cards_sum.get(i) <= M && cards_sum.get(i) > max) 
                max = cards_sum.get(i);
        }
        System.out.println(max);
    }
}
