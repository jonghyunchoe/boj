#include <iostream>
using namespace std; 

int main(void) {
    int H;
    int M;
    cin >> H >> M;
    if (M >= 45) {
        printf("%d %d\n", H, (M-45));
    }
    else if (H >= 1) {
        printf("%d %d\n", (H-1), (M+15));
    } 
    else if (H == 0) {
        printf("%d %d\n", 23, (M+15));
    }
}
