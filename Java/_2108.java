import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList; 
import java.util.Collections; 

public class _2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++)
            numbers[i] = sc.nextInt();
        
        Arrays.sort(numbers);
        double mean = 0;
        int streak = 1;
        int maxstreak = 1; 
        int prev = numbers[0]; 
        for (int i=0; i<numbers.length; i++) {
            mean += numbers[i];
            if (i != 0 && numbers[i] == prev) 
                streak++; 
            else 
                streak = 1;
            if (streak > maxstreak)
                maxstreak = streak; 
            prev = numbers[i];
        }

        LinkedList<Integer> modes = new LinkedList<Integer>(); 
        prev = numbers[0];
        streak = 1;
        for (int i=0; i<numbers.length; i++) {
            if (i != 0 && numbers[i] == prev) {
                streak++;
            }
            else 
                streak = 1;
            if (streak == maxstreak) {
                modes.add(numbers[i]);
            }
            prev = numbers[i]; 
        }

        mean = mean / numbers.length; 
        double rounded_mean = (double) Math.round((double) mean * 10) / 10.0;
        System.out.println(Math.round(rounded_mean)); 
        if (numbers.length % 2 == 0)
            System.out.println((numbers[numbers.length/2-1] + numbers[numbers.length/2])/2);
        else
            System.out.println(numbers[numbers.length/2]);

        if (modes.size() > 1) {
            Collections.sort(modes); 
            System.out.println(modes.get(1));
        }
        else 
            System.out.println(modes.get(0));
        System.out.println(numbers[numbers.length-1] - numbers[0]);
        sc.close();
    }
}