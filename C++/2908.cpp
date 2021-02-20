#include <iostream>
using namespace std;

int ReverseNumber(int);

int main(void) {
    int A;
    int B;
    cin >> A >> B;
    int reversed_A = ReverseNumber(A);
    int reversed_B = ReverseNumber(B);
    if (reversed_A > reversed_B) 
        printf("%d\n", reversed_A);
    else
        printf("%d\n", reversed_B);

}

int ReverseNumber(int number) {
    int first_digit = number % 10;
    int last_digit = number / 100; 
    int reversed_number = first_digit * 100 + last_digit * 1 + (number % 100 - number % 10);
    return reversed_number; 
}