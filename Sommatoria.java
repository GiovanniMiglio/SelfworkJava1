import java.util.Scanner;

public class Sommatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto vuoi sia lungo l'array? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("N deve essere un valore positivo.");
            return;
        }
        int numeri[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Scrivi il numero " + (i + 1));
            numeri[i] = sc.nextInt();
        }
        int sommaNumeri = 0;
        for (int i = 0; i < numeri.length; i++) {
            sommaNumeri += numeri[i];

        }
        System.out.println("la somma dei numeri e' " + sommaNumeri);
    }
}