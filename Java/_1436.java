import java.util.Scanner;
import java.util.LinkedList; 

public class _1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int movie_number = N-1; 
        if (movie_number == 0) 
            System.out.println(666);
        else {
            movie_number = movie_number * 1000 + 666;
            System.out.println(movie_number);
        }
        sc.close();

        // 1666...5666 - 1~5 (5)
        // 6660...6669 - 6~15 (10)
        // 7666...15666 - 16~24 (9)
        // 16660...16669 - 25~34 (10) 
        // 17666..25666 - 35~43 (9)
        // 26660...26669 - 44~53 (10) 
        // 27666...35666 - 54~62 (9)
        // "" - 63~72 (10) 36
        // "" - 72~80 (9) 37...45
        // "" - 81~90 (10) 46
        // "" - 91~99 (9) 47...55
        // "" - 100~109 (10) 56
        // "" - 110~118 (9) 57...65666
        // 66600...66699 - 119~218 (100) 
        // 67666..75666 - 218~226 (9)
        // 766... 
        // 666000..666999
        // 6660000...6669999

    }
}
