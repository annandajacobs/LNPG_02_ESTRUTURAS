#include <stdio.h>

int main() {
    int quant_jogos;
    const float preco_jogo = 19.90;
    const float salario_base_perc = 0.5;
    const float bonus_percentual = 0.08;
    const int quant_jogos_bonus = 15;

    printf("Digite a quantidade de jogos vendidos esse mês por Catarina: ");
    scanf("%d", &quant_jogos);

    float valor_total_vendas = quant_jogos * preco_jogo;

    float valor_bonus = 0.0;
    if (quant_jogos >= quant_jogos_bonus) {
        valor_bonus = valor_total_vendas * bonus_percentual;
    }

    float salario_base = valor_total_vendas * salario_base_perc;
    float salario_total = salario_base + valor_bonus;

    printf("%.2f\n", valor_total_vendas);
    printf("%.2f\n", valor_bonus);
    printf("%.2f\n", salario_total);

    return 0;
}
