package flamingo.aprendendo.basico.exercicioarray;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] idades = new int[6];

        for(int i = 0; i < idades.length; i++){
            System.out.printf("Digite a %d ° idade: \n", i +1);
            idades[i] = sc.nextInt();
        };

        for (int idade : idades){
            System.out.println(idade + "anos");
        }



        sc.close();
    }
}
