import java.util.Scanner;

public class IMCcalc2 {
    static void main() {
        Scanner read = new Scanner(System.in);

        System.out.println("Altura: ");
        double alt =  read.nextDouble();
        System.out.println("Peso: ");
        double peso = read.nextDouble();

        double imc = (peso / (alt * alt));
        System.out.println("IMC: " + imc);

        if  (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso Normal.");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }
        else {
            System.out.println("Obesidade Grau II");
        }
    }
}
