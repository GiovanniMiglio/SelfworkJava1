import java.util.Scanner;

public class ProvaScanner {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("inserisci un numero");
        int numero = sc.nextInt();
        System.out.println("il doppio del tuo numero e' " + numero * 2);
        
        
    }
}
