import java.util.Scanner; 
import java.util.LinkedList; 

public class _10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        LinkedList<Integer> numbers = new LinkedList<Integer>(); 
        for (int i=0; i<K; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                sum -= numbers.removeLast(); 
            }
            else {
                sum += number; 
                numbers.add(number);
            }
        }
        System.out.println(sum);
    }
}
