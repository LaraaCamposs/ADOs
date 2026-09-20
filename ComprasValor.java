import java.util.Scanner;

public class ComprasValor {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Valor: ");
        double vlr = read.nextDouble();

        double desconto = 0;

            if (vlr >= 500.00){
                System.out.println(desconto = vlr * 0.10);
            }

        double vlrFinal = vlr - desconto;

           {
               System.out.println("Subtotal");
               System.out.println("Valor: " + vlr);
               System.out.println("Desconto: " + desconto);
               System.out.printf("Valor Final: R$ %.2f\n", vlrFinal);
    }
    }
}