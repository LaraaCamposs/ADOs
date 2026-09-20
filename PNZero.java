import java.util.Scanner;

public class PNZero {
     static void main(){
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        float n = read.nextFloat();

            if (n > 0) {
                System.out.println("Positivo.");
            } else if (n < 0) {
            System.out.println("Negativo.");
            } else {
            System.out.println("Zero");
            }
    }
}
