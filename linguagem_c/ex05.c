#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_MESES 100

int main() {
    char mes_ano[8];
    float ipca, menor_ipca = 99999, maior_ipca = -99999, soma_ipca = 0;
    char menor_mes_ano[8], maior_mes_ano[8];
    int quant_meses = 0;

    printf("Digite ano/mês e o IPCA (ou * para sair):\n");
    while (1) {
        scanf("%s", mes_ano);
        if (mes_ano[0] == '*')
            break;

        scanf("%f", &ipca);

        if (ipca < menor_ipca) {
            menor_ipca = ipca;
            strcpy(menor_mes_ano, mes_ano);
        }
        if (ipca > maior_ipca) {
            maior_ipca = ipca;
            strcpy(maior_mes_ano, mes_ano);
        }

        soma_ipca += ipca;
        quant_meses++;
    }

    float media_ipca = soma_ipca / quant_meses;

    printf("%.2f (%s)\n", menor_ipca, menor_mes_ano);
    printf("%.2f (%s)\n", maior_ipca, maior_mes_ano);
    printf("%.2f\n", media_ipca);

    return 0;
}
