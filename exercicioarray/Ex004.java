package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nMedia final: " + media);

        sc.close();

    }
}
