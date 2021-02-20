import java.util.Scanner;
import java.lang.Math;

public class _1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int input = sc.nextInt();
        while (input != 0) {
            int number_digits = digits(input);
            boolean palindrome = true; 
            int exponent = 0;
            if (number_digits % 2 == 0) {
                for (int i=0; i<number_digits/2; i++) {
                    if (get_digit(input, number_digits, i+1) != get_digit(input, number_digits, number_digits-i)) {
                        palindrome = false; 
                        break;             
                    }
                } 
            }
            else {
                for (int i=0; i<(number_digits-1)/2; i++) {
                    if (get_digit(input, number_digits, i+1) != get_digit(input, number_digits, number_digits-i)) {
                        palindrome = false;
                        break;
                    }
                }
                
            }
            if (palindrome == true)
                System.out.println("yes");
            else
                System.out.println("no");
            input = sc.nextInt(); 
        }
    }

    private static int digits(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++; 
        }
        return count; 
    }

    private static int get_digit(int number, int length, int digit) {
        int value = (number / (int) Math.pow(10, length-digit)) % 10;
        return value; 
    }
}