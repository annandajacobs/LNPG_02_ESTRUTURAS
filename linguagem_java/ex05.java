import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mesAno;
        float ipca, menorIpca = Float.MAX_VALUE, maiorIpca = Float.MIN_VALUE, somaIpca = 0;
        String menorMesAno = "", maiorMesAno = "";
        int quantMeses = 0;

        System.out.println("Digite ano/mês e o IPCA (ou * para sair):");
        while (true) {
            mesAno = scanner.next();
            if (mesAno.equals("*"))
                break;

            ipca = scanner.nextFloat();

            if (ipca < menorIpca) {
                menorIpca = ipca;
                menorMesAno = mesAno;
            }
            if (ipca > maiorIpca) {
                maiorIpca = ipca;
                maiorMesAno = mesAno;
            }

            somaIpca += ipca;
            quantMeses++;
        }

        float mediaIpca = somaIpca / quantMeses;

        System.out.printf("%.2f (%s)\n", menorIpca, menorMesAno);
        System.out.printf("%.2f (%s)\n", maiorIpca, maiorMesAno);
        System.out.printf("%.2f\n", mediaIpca);

        scanner.close();
    }
}
