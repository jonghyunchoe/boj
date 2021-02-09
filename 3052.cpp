#include <iostream>
using namespace std;

int main(void) {
    int input[10];
    for (int i=0; i<10; i++)
        cin >> input[i];
    for (int i=0; i<10; i++)
        input[i] = input[i]%42;
    for (int i=0; i<10; i++) {
        for (int j=i+1; j<10; j++) {
            if (input[i] == input[j] && i != j)
                input[j] = -1; 
        }
    }

    int count = 0;
    for (int i=0; i<10; i++) {
        if (input[i] >= 0)
            count++;
    }
    printf("%d\n", count);
}
