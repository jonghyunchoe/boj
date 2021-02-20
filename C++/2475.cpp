#include <iostream>
using namespace std;

int main(void) {
    int num1, num2, num3, num4, num5;
    cin >> num1 >> num2 >> num3 >> num4 >> num5; 
    int sum_squared = num1*num1 + num2*num2 + num3*num3 + num4*num4 + num5*num5;
    int verification_number = sum_squared % 10;
    printf("%d\n", verification_number);
}