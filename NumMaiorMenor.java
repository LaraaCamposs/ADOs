import java.util.Scanner;

public class NumMaiorMenor {
        static void main() {
            Scanner read = new Scanner(System.in);

            System.out.println("Digite o Primeiro número: ");
            int n = read.nextInt();
            System.out.println("Digite o Segundo número: ");
            int n2 = read.nextInt();

            if (n > n2) {
                System.out.println( n + (" é maior!"));
            } else if (n < n2){
                System.out.println( n2 + (" é maior!"));
            }  else  {
                System.out.println("Valores Iguais!");
            }
    }
}
