#include <iostream>
#include <math.h>
using namespace std;

int main(void) {
    int A, B, V;
    cin >> A >> B >> V;
    int height = 0;
    V = V - A; 
    int time = ceil(float(V) / float(A-B));
    printf("%d\n", time+1);
}