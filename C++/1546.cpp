#include <iostream>
using namespace std;

int main(void) {
    int N;
    cin >> N; 
    float score[N];
    for (int i=0; i<N; i++) {
        cin >> score[i];
    }

    float max = 0;
    for (int i=0; i<N; i++) {
        if (score[i] > max) 
            max = score[i];
    }

    float sum = 0;
    for (int i=0; i<N; i++) {
        score[i] = (score[i] / max) * 100;
        sum += score[i];
    }

    printf("%f\n", sum / N);
}