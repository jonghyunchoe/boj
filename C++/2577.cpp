#include <iostream>
using namespace std; 

int main(void) {
    int A, B, C;
    cin >> A >> B >> C;
    int result = A * B * C;
    int numbers[10] = {0, };
    while (result > 0) {
        numbers[result % 10]++;
        result = result / 10;
    }
    for (int i=0; i<10; i++) {
        printf("%d\n", numbers[i]);
    }
}