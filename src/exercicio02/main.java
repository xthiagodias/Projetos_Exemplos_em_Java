package exercicio02;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {


            Scanner s = new Scanner(System.in);


        double vlrPi = 3.141559;
        System.out.println("Entre com o Raio: ");
        double vlrR = s.nextDouble();
        System.out.println("Entre com a Altura: ");
        double vlrAltura = s.nextDouble();

        double volume = vlrPi * (vlrR*vlrR) * vlrAltura;

        System.out.println("Volume: " +volume);

    }

}
