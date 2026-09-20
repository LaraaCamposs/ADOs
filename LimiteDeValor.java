import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LimiteDeValor {
    static void main(){
        Scanner read = new Scanner(System.in);

        System.out.println("Digite Valor: ");
        float valor = read.nextFloat();

            if (valor > 10){
                System.out.println("É MAIOR QUE 10!");
            }
            else{
                System.out.println("NÃO É MAIOR QUE 10!");
            }
    }
}
