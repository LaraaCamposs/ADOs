import java.util.Scanner;

public class ParouImpar {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um Número Inteiro: ");
        int n = read.nextInt();

        if (n % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }
    }
}