package exercicio03;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor do Salário Bruto? R$");
        double salarioBruto = s.nextDouble();

        System.out.println("Qual o valor da Prestação? %");
        double vlrPrestacao = s.nextDouble();

        if (vlrPrestacao > 30) {

            System.out.println("O valor da prestação excede o máximo permitido! Tente novamente.");

        } else {

            System.out.println("O Emprestimo foi concedido! Obrigado.");
        }

    }

}
