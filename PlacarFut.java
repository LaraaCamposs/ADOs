import java.util.Scanner;

public class PlacarFut {
    static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Time A: ");
        String a = read.nextLine();
            System.out.println("Gols do " + a + ":");
            int golsA = read.nextInt();
// Clean Line
            read.nextLine();
//Cleared
        System.out.println("Time B: ");
        String b = read.nextLine();
            System.out.println("Gols do " + b + ":");
            int golsB = read.nextInt();

            if (golsA > golsB){
                System.out.println("Vencedor: " + a);
            }
            else if (golsA < golsB){
                System.out.println("Vencedor: " + b);
            }
            else{
                System.out.println("Empate");
            }
    }
}
