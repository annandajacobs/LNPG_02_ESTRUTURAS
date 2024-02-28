import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeJogos;
        final float precoJogo = 19.90f;
        final float salarioBasePercen = 0.5f;
        final float bonusPercen = 0.08f;
        final int quantidadeJogosParaBonus = 15;

        System.out.print("Quantidade de jogos vendidos por Catarina nesse mês: ");
        quantidadeJogos = scanner.nextInt();

        float valorTotalVendas = quantidadeJogos * precoJogo;

        float valorBonus = 0.0f;
        if (quantidadeJogos >= quantidadeJogosParaBonus) {
            valorBonus = valorTotalVendas * bonusPercen;
        }

        float salarioBase = valorTotalVendas * salarioBasePercen;
        float salarioTotal = salarioBase + valorBonus;

        System.out.printf("%.2f\n", valorTotalVendas);
        System.out.printf("%.2f\n", valorBonus);
        System.out.printf("%.2f\n", salarioTotal);

        scanner.close();
    }
}
