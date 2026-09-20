import java.util.Scanner;

public class Salario {
    static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("Salário Atual: R$ ");
        double salarioAtual = read.nextDouble();

        double prcntAumento;

        if  (salarioAtual <= 1500.00) {
            prcntAumento = salarioAtual * 0.20;
        } else if (salarioAtual <= 3000.00) {
            prcntAumento = 0.15;
        } else {
            prcntAumento = 0.10;
        }

        double vlrAumento  = salarioAtual * prcntAumento;
        double novoSalario = salarioAtual + vlrAumento;

        System.out.println("Reajuste Salarial");
        System.out.printf("Salário Atual: R$ %.2f\n", salarioAtual);
        System.out.printf("Valor do Aumento: R$ %.2f (%.0f%%)%n", vlrAumento, prcntAumento * 100);
        System.out.printf("Novo Salario: R$ %.2f\n", novoSalario);

        read.close();
    }
}
