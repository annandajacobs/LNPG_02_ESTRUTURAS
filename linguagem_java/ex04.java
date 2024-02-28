import java.util.Scanner;
import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_QUESTOES = 10;
        final int MAX_PARTICIPANTES = 100;

        int[] gabarito = new int[NUM_QUESTOES];
        System.out.print("Digite as respostas do gabarito (10 inteiros separados por espaços): ");
        for (int i = 0; i < NUM_QUESTOES; i++) {
            gabarito[i] = scanner.nextInt();
        }

        String[][] nomesRespostas = new String[MAX_PARTICIPANTES][NUM_QUESTOES + 1]; // +1 para o nome
        int[] pontuacoes = new int[MAX_PARTICIPANTES];
        int numeroParticipantes = 0;

        System.out.println("Digite o nome do participante seguido das respostas ou * para sair:");
        while (true) {
            String nome = scanner.next();
            if (nome.equals("*")) break;

            nomesRespostas[numeroParticipantes][0] = nome;

            int pontuacao = 0;
            for (int i = 0; i < NUM_QUESTOES; i++) {
                int resposta = scanner.nextInt();
                nomesRespostas[numeroParticipantes][i + 1] = String.valueOf(resposta);
                if (resposta == gabarito[i]) {
                    pontuacao++;
                }
            }
            pontuacoes[numeroParticipantes] = pontuacao;

            numeroParticipantes++;
        }

        Arrays.sort(nomesRespostas, 0, numeroParticipantes, (a, b) -> a[0].compareTo(b[0]));

        System.out.println("a) Lista de participantes e suas notas em ordem alfabética:");
        for (int i = 0; i < numeroParticipantes; i++) {
            System.out.println(nomesRespostas[i][0] + ": " + pontuacoes[i]);
        }
        System.out.println();

        int maiorPontuacao = pontuacoes[0];
        int menorPontuacao = pontuacoes[0];
        for (int i = 1; i < numeroParticipantes; i++) {
            maiorPontuacao = Math.max(maiorPontuacao, pontuacoes[i]);
            menorPontuacao = Math.min(menorPontuacao, pontuacoes[i]);
        }

        System.out.println("b) Maior pontuação e participante(s):");
        for (int i = 0; i < numeroParticipantes; i++) {
            if (pontuacoes[i] == maiorPontuacao) {
                System.out.println(nomesRespostas[i][0]);
            }
        }
        System.out.println("Pontuação: " + maiorPontuacao + "\n");

        System.out.println("c) Menor pontuação e participante(s):");
        for (int i = 0; i < numeroParticipantes; i++) {
            if (pontuacoes[i] == menorPontuacao) {
                System.out.println(nomesRespostas[i][0]);
            }
        }
        System.out.println("Pontuação: " + menorPontuacao + "\n");

        int acertosMetade = 0;
        for (int i = 0; i < numeroParticipantes; i++) {
            if (pontuacoes[i] > NUM_QUESTOES / 2) {
                acertosMetade++;
            }
        }
        double percentual = (double) acertosMetade / numeroParticipantes * 100;

        System.out.printf("d) Percentual de participantes com mais da metade das questões certas: %.1f%%\n", percentual);

        scanner.close();
    }
}
