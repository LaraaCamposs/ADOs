import java.util.Scanner;

public class HoraExtra2 {
    public static void main(String[]args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Cargo do Funcionário: ");
        String cargo = read.nextLine();

        System.out.println("Quantidade de Horas Extras: ");
        double hrsEx = read.nextDouble();

        double vlrHr = read.nextDouble();

        if (cargo.equals("Administrador")) {
            vlrHr = 50.00;
        } else if (cargo.equals("Gerente")) {
            vlrHr = 35.00;
        } else if (cargo.equals("Operador")) {
            vlrHr = 20.00;
        } else {
            System.out.println("Cargo Inválido");
            read.close();
            return;
        }
        double vlrTotal = hrsEx * vlrHr;

        System.out.println("Olá Funcionário!");
        System.out.printf("Valor Total: R$ %.2f%n", hrsEx, vlrTotal);
    }
}
