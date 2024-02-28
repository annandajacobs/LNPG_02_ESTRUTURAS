import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1 = "Annanda";
        String rg1 = "123456";
        int diaNascimentoRG1 = 05;
        int mesNascimentoRG1 = 5;
        int anoNascimentoRG1 = 2004;
        int diaNascimentoPassagem1 = 05;
        int mesNascimentoPassagem1 = 5;
        int anoNascimentoPassagem1 = 2004;
        int temRG1 = 1;
        int temPassagem1 = 1;

        String nome2 = "Luana";
        String rg2 = "";
        int diaNascimentoRG2 = 10;
        int mesNascimentoRG2 = 10;
        int anoNascimentoRG2 = 2001;
        int diaNascimentoPassagem2 = 10;
        int mesNascimentoPassagem2 = 10;
        int anoNascimentoPassagem2 = 2001;
        int temRG2 = 0;
        int temPassagem2 = 1;

        String nome3 = "Gisele";
        String rg3 = "124579";
        int diaNascimentoRG3 = 23;
        int mesNascimentoRG3 = 9;
        int anoNascimentoRG3 = 2005;
        int diaNascimentoPassagem3 = 15;
        int mesNascimentoPassagem3 = 5;
        int anoNascimentoPassagem3 = 2002;
        int temRG3 = 1;
        int temPassagem3 = 1;

        String nome4 = "Ana";
        String rg4 = "849462";
        int diaNascimentoRG4 = 5;
        int mesNascimentoRG4 = 5;
        int anoNascimentoRG4 = 2005;
        int diaNascimentoPassagem4 = 5;
        int mesNascimentoPassagem4 = 5;
        int anoNascimentoPassagem4 = 2005;
        int temRG4 = 1;
        int temPassagem4 = 0;

        verificarPassageiro(nome1, rg1, diaNascimentoRG1, mesNascimentoRG1, anoNascimentoRG1, diaNascimentoPassagem1, mesNascimentoPassagem1, anoNascimentoPassagem1, temRG1, temPassagem1);
        System.out.println();
        verificarPassageiro(nome2, rg2, diaNascimentoRG2, mesNascimentoRG2, anoNascimentoRG2, diaNascimentoPassagem2, mesNascimentoPassagem2, anoNascimentoPassagem2, temRG2, temPassagem2);
        System.out.println();
        verificarPassageiro(nome3, rg3, diaNascimentoRG3, mesNascimentoRG3, anoNascimentoRG3, diaNascimentoPassagem3, mesNascimentoPassagem3, anoNascimentoPassagem3, temRG3, temPassagem3);
        System.out.println();
        verificarPassageiro(nome4, rg4, diaNascimentoRG4, mesNascimentoRG4, anoNascimentoRG4, diaNascimentoPassagem4, mesNascimentoPassagem4, anoNascimentoPassagem4, temRG4, temPassagem4);

        scanner.close();
    }

    public static void verificarPassageiro(String nome, String rg, int diaNascimentoRG, int mesNascimentoRG, int anoNascimentoRG, int diaNascimentoPassagem, int mesNascimentoPassagem, int anoNascimentoPassagem, int temRG, int temPassagem) {
        if (temRG == 1 && temPassagem == 1) {
            System.out.println("Passageiro: " + nome);
            System.out.println("RG: " + rg);
            System.out.println("Data de nascimento no RG: " + String.format("%02d/%02d/%d", diaNascimentoRG, mesNascimentoRG, anoNascimentoRG));
            System.out.println("Data de nascimento na passagem: " + String.format("%02d/%02d/%d", diaNascimentoPassagem, mesNascimentoPassagem, anoNascimentoPassagem));

            if (diaNascimentoRG == diaNascimentoPassagem && mesNascimentoRG == mesNascimentoPassagem && anoNascimentoRG == anoNascimentoPassagem) {
                System.out.println("As datas de nascimento no RG e na passagem são iguais.");
                System.out.println("Seu assento é 12A.");
            } else {
                System.out.println("ERRO: As datas de nascimento no RG e na passagem não coincidem. Chamando a polícia.");
            }
        } else if (temRG == 0) {
            System.out.println("Passageiro " + nome + " não tem RG. Direcionando para a saída.");
        } else if (temPassagem == 0) {
            System.out.println("Passageiro " + nome + " não tem passagem. Direcionando para a recepção do aeroporto.");
        }
    }
}
