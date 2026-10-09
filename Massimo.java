public class Massimo {
    public static void main(String[] args) {
        int numeri[] = {-5,-2,-4,-7 };
        
        if (numeri.length == 0) {
            System.out.println("L'array è vuoto.");
            
        } else {
            int max = numeri[0];
            for (int i = 1; i < numeri.length; i++) {
                if (numeri[i] > max) {
                    max = numeri[i];
                }
            }
            System.out.println("Il massimo è: " + max);
        }
    }
}
    