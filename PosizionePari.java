public class PosizionePari {
    public static void main(String[] args) {
        int numeri[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= numeri.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println("Il numero " + numeri[i] + " è in posizione pari: " + i);
            }
        }
        for (int i=0; i < numeri.length; i+=2) {
               System.out.println("Il numero " + numeri[i] + " è in posizione pari: " + i);
            }
        
    }
}
