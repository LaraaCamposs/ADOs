import java.util.Scanner;

public class IdadeCAA {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = read.nextInt();

        if (idade >= 18) {
            System.out.println("Adulto");
        }
        else if (idade >= 12) {
            System.out.println("Adolescente");
        }
        else {
            System.out.println("Criança");
    }
}
}
