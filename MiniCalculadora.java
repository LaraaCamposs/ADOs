import java.security.KeyStore;
import java.util.Scanner;

public class MiniCalculadora {
    static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        double n1 = read.nextDouble();

        System.out.println("Segundo Número: ");
        double n2 = read.nextDouble();

        System.out.println("Operação (+, -, *, /): ");
        char op = read.next().charAt(0);

        double total = 0;
        boolean opValid = true;

        switch (op) {
            case '+' -> total = (n1 + n2);

            case '-' -> total = (n1 - n2);
            case '*' -> total = (n1 * n2);
            case '/' -> {
                if (n2 == 0) {
                    System.out.println("Erro: Não é Divisivel");
                    opValid = false;
                } else {
                    total = n1 / n2;
                }
            }
            default -> {
                System.out.println("Operação Invalida!");
                opValid = false;

                read.close();
            }
        }
    }
}