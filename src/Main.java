import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rand.nextInt(100);
        int b;
        for (int i = 0; i < 10; i++) {
            System.out.println("introduce un valor de 1 al 100");
            b = sc.nextInt();
            if (a == b) {
                System.out.println("El valor es el numero random" );
                return ;
            }
            if (a < b) {
                System.out.println("El valor es mayor que el numero random"+ " te quedan "+ (9-i)+ " intentos");
            }
            if (a > b) {
                System.out.println("El valor es menor que el numero random"+ " te quedan "+ (9-i)+ " intentos");
            }
        }
    }
}