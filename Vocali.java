public class Vocali {

    public static void main(String[] args) {
        String parola = "zoo";
        boolean VocaliUguali = false;
        for (int i = 0; i < parola.length() - 1; i++) {
            char lettera = parola.charAt(i);
            if (lettera == (parola.charAt(i + 1))
                    && (lettera == 'a'  || lettera == 'e' || lettera == 'i'
                            || lettera == 'o' || lettera == 'u')) {
                VocaliUguali = true;
                break;

            }

        }
        if (VocaliUguali) {
            System.out.println("Ci sono due vocali uguali consecutive");
        } else {
            System.out.println("non Ci sono due vocali uguali consecutive");
        }
    }
}