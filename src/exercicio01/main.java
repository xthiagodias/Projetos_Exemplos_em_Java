package exercicio01;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {



       Scanner s = new Scanner(System.in);


        System.out.println("Entre com o valor da conta: R$");
        double conta = s.nextDouble();
        double gorjeta = (conta*10/100);

        System.out.println("Valor total SEM gorjeta: " +"R$"+conta);
        System.out.println("Valor total COM gorjeta: " +"R$"+(gorjeta+conta));



    }

}
