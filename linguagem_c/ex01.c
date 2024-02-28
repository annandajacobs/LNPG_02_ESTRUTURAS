#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int dia;
    int mes;
    int ano;
} Data;

int main() {
    struct Passageiro {
        char nome[50];
        char rg[20];
        Data data_nasc_rg;
        Data data_nasc_passagem;
        int tem_rg;
        int tem_passagem;
    } passageiros[] = {
        {"Camila", "123456", {10, 7, 2010}, {10, 7, 2010}, 1, 1},
        {"Annanda", "", {5, 5, 2004}, {5, 5, 2004}, 0, 1},
        {"Dan", "987654", {28, 2, 1962}, {28, 2, 2000}, 1, 1},
        {"Neide", "654321", {17, 9, 1991}, {10, 1, 1991}, 1, 0}
    };

    for (int i = 0; i < sizeof(passageiros) / sizeof(passageiros[0]); ++i) {
        if (passageiros[i].tem_rg && passageiros[i].tem_passagem) {
            printf("Passageiro: %s\n", passageiros[i].nome);
            printf("RG: %s\n", passageiros[i].rg);
            printf("Data de nascimento no RG: %02d/%02d/%d\n", passageiros[i].data_nasc_rg.dia, passageiros[i].data_nasc_rg.mes, passageiros[i].data_nasc_rg.ano);
            printf("Data de nascimento na passagem: %02d/%02d/%d\n", passageiros[i].data_nasc_passagem.dia, passageiros[i].data_nasc_passagem.mes, passageiros[i].data_nasc_passagem.ano);
         
            if (passageiros[i].data_nasc_rg.dia == passageiros[i].data_nasc_passagem.dia &&
                passageiros[i].data_nasc_rg.mes == passageiros[i].data_nasc_passagem.mes &&
                passageiros[i].data_nasc_rg.ano == passageiros[i].data_nasc_passagem.ano) {
                printf("As datas de nascimento no RG e na passagem são iguais.\n");
                printf("Seu assento é A12. Tenha um ótimo dia!\n");
            } else {
                printf("Erro: As datas de nascimento no RG e na passagem não são iguais. Chamar a polícia.\n");
            }
        } else if (!passageiros[i].tem_rg) {
            printf("Passageiro %s não tem RG. Direcionando para a saída.\n", passageiros[i].nome);
        } else if (!passageiros[i].tem_passagem) {
            printf("Passageiro %s não tem passagem. Direcionando para a recepção do aeroporto.\n", passageiros[i].nome);
        }
        printf("\n");
    }

    return 0;
}
