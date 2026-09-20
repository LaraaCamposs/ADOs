import java.util.Scanner;

public class ImpostoImportacao {
     static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Produto: ");
        String prod = read.nextLine();

        System.out.println("Preço: ");
        double prc = read.nextDouble();

        System.out.println("Identificador 'N' para Nacionais, 'I' para Importados:  ");
        char id = read.next().toUpperCase().charAt(0);

        double prcFinal = prc;

        switch (id) {
            case 'N' -> {
                prcFinal = prc + (prc * 0.10);
            }
            case 'I' -> {
                prcFinal = (prc + (prc * 0.25)) + 50.00;
            }
            default -> {
                System.out.println("ID Inválido - Use N ou I.");
                read.close();
                return;
            }
        }
        System.out.println("Subtotal");
        System.out.println("Produto: " + prod);
        System.out.printf("Preço Final: R$ %.2f\n", prcFinal);
        read.close();
    }
}