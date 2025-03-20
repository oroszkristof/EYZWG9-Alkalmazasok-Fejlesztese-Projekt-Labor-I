package masodik_valosveletlen;

import java.util.Scanner;

public class masodik_valosveletlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a(z) számok darabszámát: ");
        int szam = sc.nextInt();
        double[] tomb = new double[szam];
        double osszeg = 0.0;
        for (int i = 0; i < szam; i++) {
            System.out.print("Kérem a(z) " + (i + 1) + ". számot: ");
            tomb[i] = sc.nextDouble();
            osszeg += tomb[i];
        }
        double atlag = osszeg / szam;
        System.out.println("Az átlag: " + atlag);
        if (atlag >= 4.0 && atlag <= 5.0) {
            System.out.println("Az átlag 4.0 és 5.0 között van!");
        }
        System.out.println("Az összeg: " + osszeg);
        sc.close();
    }
}

