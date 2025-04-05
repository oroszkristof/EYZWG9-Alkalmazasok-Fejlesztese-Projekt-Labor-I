package otodik_oktato;

public class Futtathato {
    public static void main(String[] args) {
        try {
        	otodik_oktato oktato1 = new otodik_oktato("Kovács Anna", "ABC123", 35, "THE", "egyetemi adjunktus", 3, 500000, 4);
        	otodik_oktato oktato2 = new otodik_oktato("Nagy Péter", "DEF456", 40, "THE", "egyetemi docens", 5, 600000, 10);
        	otodik_oktato oktato3 = new otodik_oktato("Szabó László", "GHI789", 30, "THE", "egyetemi tanársegéd", 2, 400000, 2);
            System.out.println(oktato1);
            System.out.println("Kategória: " + oktato1.getKategoriya());
            System.out.println();
            System.out.println(oktato2);
            System.out.println("Kategória: " + oktato2.getKategoriya());
            System.out.println();
            System.out.println(oktato3);
            System.out.println("Kategória: " + oktato3.getKategoriya());
            System.out.println();
            oktato1.noveltTantargyakSzama(2);
            System.out.println("Oktató1 tantárgyak száma növelve: " + oktato1.getTantargyakSzama());
            oktato2.csokkentTantargyakSzama(1);
            System.out.println("Oktató2 tantárgyak száma csökkentve: " + oktato2.getTantargyakSzama());
            oktato3.novelFizetes(10);
            System.out.println("Oktató3 fizetése növelve: " + oktato3.getFizetes());
        } catch (IllegalArgumentException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
}

