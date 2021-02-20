#include <iostream>
#include <math.h>
using namespace std;

int main(void) {
    int A, B, V;
    cin >> A >> B >> V;
    int height = 0;
    V = V - A; 
    int time = ceil((double)(V) / (A-B));
    if (time >= 0)
        printf("%d\n", time+1);
    else {
        printf("%d\n", 1);
    }
}