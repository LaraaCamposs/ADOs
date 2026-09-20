import java.util.Scanner;

public class IMCcalc {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Altura: ");
        double alt =  read.nextDouble();
        System.out.println("Peso: ");
        double peso = read.nextDouble();

        double imc = (peso / (alt * alt));
        System.out.println("IMC: " + imc);

        if  (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Peso Normal.");
        }
        else if (imc > 24.9) {
            System.out.println("Acima do peso!");
        }
    }
}
