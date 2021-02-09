#include <iostream>
using namespace std; 

int main(void) {
    int N;
    cin >> N;
    char input[N];
    for (int i=0; i<N; i++)
        cin >> input[i];
    
    int sum = 0;
    for (int i=0; i<N; i++) 
        sum += int(input[i]-'0');
    
    printf("%d\n", sum);
}