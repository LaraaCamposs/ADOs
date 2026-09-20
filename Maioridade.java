import java.util.Scanner;

public class Maioridade {
    static void main() {
        Scanner read = new Scanner(System.in);

    System.out.println("Idade: ");
        int idade = read.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de Idade.");
        }
        else {
            System.out.println("Menor de Idade.");
        }
    }
}