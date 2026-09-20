import java.util.Scanner;

public class MediaEscolar {
    static void main(){
        Scanner read = new Scanner(System.in);

        System.out.println("Nota 1: ");
        float n1 =  read.nextFloat();
        System.out.println("Nota 2: ");
        float n2 =  read.nextFloat();

            float media  = (n1+n2)/2;
                System.out.println("Media: " + media);

            if (media >= 7.0){
                System.out.println("Aprovado");
            }
            else if (media >= 5.0) {
                System.out.println("Recuperação");
            }
            else {
                System.out.println("Reprovado");
            }
        }
    }