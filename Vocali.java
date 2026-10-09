public class Vocali {

    public static void main(String[] args) {
        String parola = "ZOO";
        parola = parola.toLowerCase();
        boolean vocaliUguali = false;
        for (int i = 0; i < parola.length() - 1; i++) {
            char lettera = parola.charAt(i);
            if (lettera == (parola.charAt(i + 1))
                    && (lettera == 'a' || lettera == 'e' || lettera == 'i'
                            || lettera == 'o' || lettera == 'u')) {
                vocaliUguali = true;
                break;

            }

        }
        if (vocaliUguali) {
            System.out.println("Ci sono due vocali uguali consecutive");
        } else {
            System.out.println("non ci sono due vocali uguali consecutive");
        }
    }
}