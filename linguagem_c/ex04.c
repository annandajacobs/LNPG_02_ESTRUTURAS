#include <stdio.h>
#include <string.h>

#define MAX_PARTICIPANTES 100
#define MAX_NOME_TAMANHO 50
#define NUM_QUESTOES 10

int main() {
    int gabarito[NUM_QUESTOES];
    printf("Digite as respostas do gabarito (10 inteiros separados por espaços): ");
    for (int i = 0; i < NUM_QUESTOES; i++) {
        scanf("%d", &gabarito[i]);
    }

    char nomes[MAX_PARTICIPANTES][MAX_NOME_TAMANHO];
    int respostas[MAX_PARTICIPANTES][NUM_QUESTOES];
    int pontuacoes[MAX_PARTICIPANTES] = {0};
    int numero_participantes = 0;

    printf("Digite o nome do participante seguido das respostas ou * para sair:\n");
    while (1) {
        scanf("%s", nomes[numero_participantes]);
        if (nomes[numero_participantes][0] == '*') break;

        for (int i = 0; i < NUM_QUESTOES; i++) {
            scanf("%d", &respostas[numero_participantes][i]);
            if (respostas[numero_participantes][i] == gabarito[i]) {
                pontuacoes[numero_participantes]++;
            }
        }
        numero_participantes++;
    }

    for (int i = 0; i < numero_participantes - 1; i++) {
        for (int j = i + 1; j < numero_participantes; j++) {
            if (strcmp(nomes[i], nomes[j]) > 0) {
                char temp[MAX_NOME_TAMANHO];
                strcpy(temp, nomes[i]);
                strcpy(nomes[i], nomes[j]);
                strcpy(nomes[j], temp);
                int tempPontuacao = pontuacoes[i];
                pontuacoes[i] = pontuacoes[j];
                pontuacoes[j] = tempPontuacao;
            }
        }
    }

    printf("a) Lista de participantes e suas notas em ordem alfabética:\n");
    for (int i = 0; i < numero_participantes; i++) {
        printf("%s: %d\n", nomes[i], pontuacoes[i]);
    }
    printf("\n");

    int maior_pontuacao = pontuacoes[0];
    int menor_pontuacao = pontuacoes[0];
    for (int i = 1; i < numero_participantes; i++) {
        if (pontuacoes[i] > maior_pontuacao) {
            maior_pontuacao = pontuacoes[i];
        }
        if (pontuacoes[i] < menor_pontuacao) {
            menor_pontuacao = pontuacoes[i];
        }
    }

    printf("b) Maior pontuação e participante(s):\n");
    for (int i = 0; i < numero_participantes; i++) {
        if (pontuacoes[i] == maior_pontuacao) {
            printf("%s\n", nomes[i]);
        }
    }
    printf("Pontuação: %d\n\n", maior_pontuacao);

    printf("c) Menor pontuação e participante(s):\n");
    for (int i = 0; i < numero_participantes; i++) {
        if (pontuacoes[i] == menor_pontuacao) {
            printf("%s\n", nomes[i]);
        }
    }
    printf("Pontuação: %d\n\n", menor_pontuacao);

    int acertos_metade = 0;
    for (int i = 0; i < numero_participantes; i++) {
        if (pontuacoes[i] > NUM_QUESTOES / 2) {
            acertos_metade++;
        }
    }
    float percentual = (float)acertos_metade / numero_participantes * 100;

    printf("d) Percentual de participantes com mais da metade das questões certas: %.1f%%\n", percentual);

    return 0;
}
