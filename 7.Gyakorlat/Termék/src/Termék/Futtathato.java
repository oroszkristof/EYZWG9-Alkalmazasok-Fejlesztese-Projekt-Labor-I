package Termék;


import Termék.Termek;
import Termék.Edesseg;
import Termék.Pekaru;
import Termék.Tisztitoszer;

public class Futtathato {
    public static void main(String[] args) {
        
        Termek t1 = new Termek(1, "AlapTermek", 1000.0, "GyartoA");
        Termek t2 = new Termek(2, "DragaTermek", 2500.0, "GyartoB");
        Termek t3 = new Termek(3, "KozepTermek", 1500.0, "GyartoA");

        
        Termek dragabb = Termek.masodikAru(t1, t2);
        System.out.println("Drágább termék: " + dragabb.getNev() + " (" + dragabb.getAr() + " Ft)");

        
        Termek[] termekek = { t1, t2, t3 };
        Termek legolcsobb = Termek.legolcsobbTermek(termekek);
        System.out.println("Legolcsóbb termék: " + legolcsobb.getNev() + " (" + legolcsobb.getAr() + " Ft)");

        
        Termek[] gyartoA = Termek.gyartoAlapjan(termekek, "GyartoA");
        System.out.println("GyartoA termékei:");
        for (Termek t : gyartoA) {
            System.out.println(" - " + t.getNev());
        }

        
        Edesseg ed1 = new Edesseg(4, "Csoki", 800.0, "GyartoC", 100.0, 50.0, 30.0);
        Edesseg ed2 = new Edesseg(5, "Szelet", 600.0, "GyartoC", 80.0, 40.0, 20.0);
        System.out.println("Édesség cukortartalom: " + ed1.getCukorTartalom() + "%");

        
        Pekaru p1 = new Pekaru(6, "Kifli", 200.0, "GyartoD", 50.0);
        System.out.println("Pékáru súlya: " + p1.getSuly() + " g");

        
        Tisztitoszer[] tisztok = {
            new Tisztitoszer(7, "Mosogató", 1200.0, "GyartoE", "Mosogató", 240.0),
            new Tisztitoszer(8, "Padlótisztító", 1500.0, "GyartoE", "Padlótisztító", 300.0),
            new Tisztitoszer(9, "Mosogató Extra", 1000.0, "GyartoE", "Mosogató", 200.0)
        };
        Tisztitoszer[] mosogatok = Tisztitoszer.tipusSzerint(tisztok, "Mosogató");
        double atlag = Tisztitoszer.atlagEgysegar(tisztok, "Mosogató");
        Tisztitoszer[] olcsobbek = Tisztitoszer.olcsobbMintAtlag(tisztok, "Mosogató");

        System.out.println("Mosogatók átlag egységára: " + atlag + " Ft/kg");
        System.out.println("Mosogatók átlag alatti egységárú tételek:");
        for (Tisztitoszer t : olcsobbek) {
            System.out.println(" - " + t.getNev() + ": " + t.getEgysegar() + " Ft/kg");
        }
    }
}

