import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int n = scanner.nextInt();

        double S = 0.0;

        int sinal = 1;
        for (int i = 1, j = 0; j < n; i += 2, j++) {
            S += (double) sinal / (i * i * i);
            sinal *= -1;
        }

        double pi = Math.pow(S * 32, 1.0 / 3.0);

        System.out.printf("O valor aproximado de pi com %d termos da série é: %.5f\n", n, pi);

        scanner.close();
    }
}
