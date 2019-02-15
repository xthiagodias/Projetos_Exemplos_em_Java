package exercicio04;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o número: ");
        int numero = s.nextInt();

        if ((numero >= 0) && (numero <= 100)) {

            System.out.println("O número fica entre 0 e 100.");

        } else {

            System.out.println("O número não esta entre 0 a 100.");
        }

    }

}
