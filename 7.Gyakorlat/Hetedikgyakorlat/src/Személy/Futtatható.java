package Személy;

import Személy.Személy;
import Személy.Alkalmazott;

public class Main {
    public static void main(String[] args) {
        
        Személy s1 = new Személy("János", 30, "Budapest", "A123456");
        Személy s2 = new Személy("Erika", 25, "Szeged",   "B654321");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1 idősebb mint s2? " + s1.idosebbMint(s2));
        System.out.println("Idősebb (statikus): " + Személy.idosebb(s1, s2).getNev());
        
        System.out.println();

        
        Alkalmazott a1 = new Alkalmazott("Anna", 28, "Bp.", "C111111", 200000, "Fejlesztő", "Acme");
        Alkalmazott a2 = new Alkalmazott("Béla", 35, "Győr", "D222222", 250000, "Fejlesztő", "Acme");
        Alkalmazott a3 = new Alkalmazott("Cecil", 40, "Miskolc","E333333", 300000, "Menedzser",  "Beta");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("a2 fizetése nagyobb mint a1-é? " + a2.nagyobbFizetesuMint(a1));
        System.out.println("Nagyobb fizetésű (statikus): " + Alkalmazott.nagyobbFizetesu(a1, a3).getNev());
        System.out.println("a1 éves fizetése: " + a1.evesFizetes());
        
        Alkalmazott[] all = { a1, a2, a3 };
        System.out.println("„Acme” éves bérköltség: " 
            + Alkalmazott.osszesEvesBerkoltseg(all, "Acme"));
        System.out.println("a1-gyel egyezik beosztás éves költsége: " 
            + a1.evesBerkoltsegAzonosBeosztasu(all));
        System.out.println("a1 átlagos havi bérköltség (azonos beosztás): " 
            + a1.atlagosHaviBerkoltseg(all));
    }
}

