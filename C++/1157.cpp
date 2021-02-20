#include <iostream>
using namespace std;

int main(void) {
    string input;
    cin >> input;
    int alphabet[26] = {0, };

    for (char c: input) {
        if (c < 97) 
            alphabet[c-65]++;
        else 
            alphabet[c-97]++;
    }

    int max = 0;
    for (int i=0; i<26; i++) {
        if (alphabet[i] > alphabet[max])
            max = i;
    }

    int count = 0;
    for (int i=0; i<26; i++) {
        if (alphabet[i] == alphabet[max])
            count++;
    }
    if (count == 1)    
        printf("%c\n", ('A' + max)); 
    else 
        printf("?\n");
}