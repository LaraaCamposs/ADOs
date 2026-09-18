import java.util.Scanner;

public class triangle {
    public static void main(){
        Scanner read = new Scanner(System.in);

    System.out.println("Lado 1: ");
        float l1 = read.nextFloat();
    System.out.println("Lado 2: ");
        float l2 = read.nextFloat();
    System.out.println("Lado 3: ");
        float l3 = read.nextFloat();

//If and Else
        if (l1 + l2 > l3 && (l2 + l3 > l1 && (l3 + l1 > l2))) {
            System.out.println("Triângulo Válido");

            if (l1 == l2 && (l2 == l3)) {
                System.out.println("Triângulo Equilatero");
            } else if (l1 == l2 || (l2 == l3 || l1 == l3)) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else
        { System.out.println("Não é Válido!"); }

        }
}
