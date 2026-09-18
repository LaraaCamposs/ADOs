import java.util.Scanner;

public class media {
    public static void main(){
        Scanner read = new Scanner(System.in);

    System.out.println("Nota 1: ");
        float n1 = read.nextFloat();
    System.out.println("Nota 2: ");
        float n2 = read.nextFloat();
    System.out.println("Nota 3: ");
        float n3 = read.nextFloat();
    System.out.println("Quantidade De Faltas: ");
        float flt = read.nextFloat();
//Process
    float media = (n1+n2+n3)/3;
        System.out.println("Média: " + media);
//If and Else
            if (media >= 6 && (flt <= 18))
                System.out.println("APROVADO!!!");
                    else System.out.println("REPROVADO.");
    }
}
