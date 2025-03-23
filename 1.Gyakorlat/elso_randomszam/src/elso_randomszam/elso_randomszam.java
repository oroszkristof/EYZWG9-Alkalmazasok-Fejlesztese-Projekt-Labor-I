package elso_randomszam;

import java.util.Random;

public class elso_randomszam {
    public static void main(String[] args) {
        Random rnd = new Random();
        int darabszam = 0;
        for (int i = 0; i < 100; i++) {
            int szam = rnd.nextInt(100) + 1;
            if (szam <= 10) {
                System.out.println(szam);
                darabszam++;
            }
        }
        System.out.println("Darabszam: " + darabszam);
    }
}
