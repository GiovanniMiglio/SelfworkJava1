public class Media {
    public static void main(String[] args) {
        int numeri[] = {2,4,6,3};
        if (numeri.length == 0) {
            System.out.println("L'array è vuoto.");
            return;
        }
        int sommaPari = 0;
        int sommaDispari = 0;
        int countPari = 0;
        int countDispari = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] % 2 == 0) {
                sommaPari += numeri[i];
                countPari++;
            } else {
                sommaDispari += numeri[i];
                countDispari++;
            }
        }

        if (countPari == 0) {
            System.out.println("non ci sono numeri pari");
        } else {
            System.out.println("la media dei numeri pari è: " + (double) sommaPari / countPari);
        }
        System.out.println("Numero di numeri pari: " + countPari);
        if (countDispari == 0) {
            System.out.println("non ci sono numeri dispari");
        } else {
            System.out.println("La media dei numeri dispari è: " + (double) sommaDispari / countDispari);
        }
        System.out.println("Numero di numeri dispari: " + countDispari);

        System.out.println(
                "La media dei numeri è: " + (double) (sommaPari + sommaDispari) / (countPari + countDispari));

    }
}
