package kiegeszitett_hallgato;

import java.util.Random;
import java.util.Scanner;

public class kiegeszitett_main {
    public static void main(String[] args) {
        Random random = new Random();
        kiegeszitett_hallgato[] hallgatok = new kiegeszitett_hallgato[10];
        for (int i = 0; i < 10; i++) {
            String nev = "Hallgato" + (i + 1);
            String neptunKod = generateRandomNeptunKod(random);
            double atlag = 1.0 + random.nextDouble() * 4.0;
            atlag = Math.round(atlag * 100.0) / 100.0;
            int tantargyakSzama = random.nextInt(10) + 1;
            hallgatok[i] = new kiegeszitett_hallgato(nev, neptunKod, atlag, tantargyakSzama);
        }
        
        kiegeszitett_hallgato legtobbTantargyatFelvet = hallgatok[0];
        kiegeszitett_hallgato legjobbAtlag = hallgatok[0];
        for (int i = 1; i < hallgatok.length; i++) {
            legtobbTantargyatFelvet = kiegeszitett_hallgato.getTobbTantargyatFelvetto(legtobbTantargyatFelvet, hallgatok[i]);
            legjobbAtlag = kiegeszitett_hallgato.getMagasabbAtlagu(legjobbAtlag, hallgatok[i]);
        }
        
        System.out.println("Legtöbb tantárgyat felvett hallgató:");
        System.out.println(legtobbTantargyatFelvet);
        System.out.println("\nLegjobb átlaggal rendelkező hallgató:");
        System.out.println(legjobbAtlag);
        
        kiegeszitett_hallgato legkevesebbTantargyatFelvet = hallgatok[0];
        kiegeszitett_hallgato legalacsonyabbAtlag = hallgatok[0];
        for (int i = 1; i < hallgatok.length; i++) {
            if (hallgatok[i].getTantargyakSzama() < legkevesebbTantargyatFelvet.getTantargyakSzama()) {
                legkevesebbTantargyatFelvet = hallgatok[i];
            }
            if (hallgatok[i].getAtlag() < legalacsonyabbAtlag.getAtlag()) {
                legalacsonyabbAtlag = hallgatok[i];
            }
        }
        
        System.out.println("\nLegkevesebb tantárgyat felvett hallgató:");
        System.out.println(legkevesebbTantargyatFelvet);
        System.out.println("\nLegalacsonyabb átlaggal rendelkező hallgató:");
        System.out.println(legalacsonyabbAtlag);
        
        System.out.println("\nAz aktuális ösztöndíj minimum átlag: " + kiegeszitett_hallgato.getMinOsztondijAtlag());
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdja meg az új ösztöndíj minimum átlagot: ");
        double ujMinAtlag = scanner.nextDouble();
        kiegeszitett_hallgato.setMinOsztondijAtlag(ujMinAtlag);
        System.out.println("Az új ösztöndíj minimum átlag: " + kiegeszitett_hallgato.getMinOsztondijAtlag());
        
        System.out.println("\nHallgatók ösztöndíj teljesítési különbsége:");
        for (kiegeszitett_hallgato h : hallgatok) {
            double kulonbseg = h.osztondijTeljesitesiKulonbseg();
            String eredmeny = (kulonbseg >= 0) ? "túlteljesítette" : "alulteljesítette";
            System.out.println(h.getNev() + " (" + h.getAtlag() + "): " +
                Math.abs(kulonbseg) + " ponttal " + eredmeny + " az ösztöndíj minimumot.");
        }
        
        scanner.close();
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
