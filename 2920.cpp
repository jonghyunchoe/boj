#include <iostream>
using namespace std;

int main(void) {
    int notes[8];
    for (int i=0; i<8; i++) 
        cin >> notes[i]; 
    int ascending = 1;
    int descending = 1; 
    for (int i=0; i<8; i++) {
        if (notes[i] != (i+1)) {
            ascending = 0;
        }
        if (notes[i] != (8-i)) {
            descending = 0;
        }
    }
    if (ascending == 1) 
        printf("ascending\n");
    else if (descending == 1)
        printf("descending\n");
    else 
        printf("mixed\n");
}