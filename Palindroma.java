public class Palindroma {
    public static void main(String[] args) {
        String parola = "Anna";
        parola = parola.toLowerCase();
        boolean palindroma = true;
        for (int i = 0; i < parola.length() / 2; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
                palindroma = false;
                break;
            }
        }
        if (palindroma) {
            System.out.println("La parola e' Palindroma");
        } else {
            System.out.println("La parola non e' Palindroma");
        }
        
    }
}
