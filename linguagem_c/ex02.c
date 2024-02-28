#include <stdio.h>
#include <math.h>

int main() {
    int n;
    double S = 0.0;

    printf("Digite o número de termos da série: ");
    scanf("%d", &n);

    int sinal = 1;
    for (int i = 1, j = 0; j < n; i += 2, j++) {
        S += (double)sinal / (i * i * i);
        sinal *= -1;
    }

    double pi = pow(S * 32, 1.0 / 3.0);

    printf("O valor aproximado de pi com %d termos da série é: %.5lf\n", n, pi);

    return 0;
}
