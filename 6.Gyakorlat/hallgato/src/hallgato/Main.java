package hallgato;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Hallgato[] hallgatok = new Hallgato[10];
        for (int i = 0; i < 10; i++) {
            String nev = "Hallgato" + (i + 1);
            String neptunKod = generateRandomNeptunKod(random);
            double atlag = 1.0 + random.nextDouble() * 4.0;
            atlag = Math.round(atlag * 100.0) / 100.0;
            int tantargyakSzama = random.nextInt(10) + 1;
            hallgatok[i] = new Hallgato(nev, neptunKod, atlag, tantargyakSzama);
        }
        Hallgato legtobbTantargyatFelvet = hallgatok[0];
        Hallgato legjobbAtlag = hallgatok[0];
        for (int i = 1; i < hallgatok.length; i++) {
            if (hallgatok[i].tobbTantargyatFelvet(legtobbTantargyatFelvet)) {
                legtobbTantargyatFelvet = hallgatok[i];
            }
            if (hallgatok[i].nagyobbAtlag(legjobbAtlag)) {
                legjobbAtlag = hallgatok[i];
            }
        }
        System.out.println("Legtöbb tantárgyat felvett hallgató:");
        System.out.println(legtobbTantargyatFelvet);
        System.out.println("\nLegjobb átlaggal rendelkező hallgató:");
        System.out.println(legjobbAtlag);
    }

    public static String generateRandomNeptunKod(Random random) {
        String karakterek = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(karakterek.charAt(random.nextInt(karakterek.length())));
        }
        return sb.toString();
    }
}
