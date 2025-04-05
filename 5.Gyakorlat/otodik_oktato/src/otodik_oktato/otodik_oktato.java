package otodik_oktato;

public class otodik_oktato {
    private String nev;
    private String neptunKod;
    private int eletkor;
    private String egyetem;
    private String intezet;
    private String beosztas;
    private int tantargyakSzama;
    private double fizetes;
    private int publikaciokSzama;

    private static final String[] VALID_BEOSZTASOK = {
        "egyetemi tanársegéd", "egyetemi adjunktus", "egyetemi docens", "egyetemi tanár", "mérnöktanár", "óraadó oktató"
    };

    public otodik_oktato(String nev, String neptunKod, int eletkor, String egyetem,
               String intezet, String beosztas, int tantargyakSzama,
               double fizetes, int publikaciokSzama) {
        setNev(nev);
        setNeptunKod(neptunKod);
        setEletkor(eletkor);
        setEgyetem(egyetem);
        setIntezet(intezet);
        setBeosztas(beosztas);
        setTantargyakSzama(tantargyakSzama);
        setFizetes(fizetes);
        setPublikaciokSzama(publikaciokSzama);
    }

    public otodik_oktato(String nev, String neptunKod, int eletkor,
               String intezet, String beosztas, int tantargyakSzama,
               double fizetes, int publikaciokSzama) {
        this(nev, neptunKod, eletkor, "THE", intezet, beosztas, tantargyakSzama, fizetes, publikaciokSzama);
    }

    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        if (nev == null || nev.trim().isEmpty()) {
            throw new IllegalArgumentException("Név nem lehet üres!");
        }
        this.nev = nev;
    }

    public String getNeptunKod() {
        return neptunKod;
    }
    public void setNeptunKod(String neptunKod) {
        if (neptunKod == null || neptunKod.trim().isEmpty()) {
            throw new IllegalArgumentException("Neptun kód nem lehet üres!");
        }
        this.neptunKod = neptunKod;
    }

    public int getEletkor() {
        return eletkor;
    }
    public void setEletkor(int eletkor) {
        if (eletkor <= 0) {
            throw new IllegalArgumentException("Életkor csak pozitív szám lehet!");
        }
        this.eletkor = eletkor;
    }

    public String getEgyetem() {
        return egyetem;
    }
    public void setEgyetem(String egyetem) {
        if (egyetem == null || egyetem.trim().isEmpty()) {
            throw new IllegalArgumentException("Egyetem nem lehet üres!");
        }
        this.egyetem = egyetem;
    }

    public String getIntezet() {
        return intezet;
    }
    public void setIntezet(String intezet) {
        if (intezet == null || intezet.trim().isEmpty()) {
            throw new IllegalArgumentException("Intézet nem lehet üres!");
        }
        this.intezet = intezet;
    }

    public String getBeosztas() {
        return beosztas;
    }
    public void setBeosztas(String beosztas) {
        if (beosztas == null || beosztas.trim().isEmpty()) {
            throw new IllegalArgumentException("Beosztás nem lehet üres!");
        }
        boolean valid = false;
        for (String b : VALID_BEOSZTASOK) {
            if (b.equalsIgnoreCase(beosztas.trim())) {
                valid = true;
                break;
            }
        }
        if (!valid) {
            throw new IllegalArgumentException("Érvénytelen beosztás! Megengedett értékek: tanársegéd, adjunktus, docens, egyetemi tanár, mérnöktanár, óraadó oktató.");
        }
        this.beosztas = beosztas;
    }

    public int getTantargyakSzama() {
        return tantargyakSzama;
    }
    public void setTantargyakSzama(int tantargyakSzama) {
        if (tantargyakSzama < 0) {
            throw new IllegalArgumentException("A tantárgyak száma nem lehet negatív!");
        }
        this.tantargyakSzama = tantargyakSzama;
    }

    public double getFizetes() {
        return fizetes;
    }
    public void setFizetes(double fizetes) {
        if (fizetes < 0) {
            throw new IllegalArgumentException("A fizetés nem lehet negatív!");
        }
        this.fizetes = fizetes;
    }

    public int getPublikaciokSzama() {
        return publikaciokSzama;
    }
    public void setPublikaciokSzama(int publikaciokSzama) {
        if (publikaciokSzama < 0) {
            throw new IllegalArgumentException("A publikációk száma nem lehet negatív!");
        }
        this.publikaciokSzama = publikaciokSzama;
    }

    public void noveltTantargyakSzama(int ertek) {
        if (ertek < 0) {
            throw new IllegalArgumentException("Növelés értékének pozitívnak kell lennie!");
        }
        this.tantargyakSzama += ertek;
    }

    public void csokkentTantargyakSzama(int ertek) {
        if (ertek < 0) {
            throw new IllegalArgumentException("Csökkentés értékének pozitívnak kell lennie!");
        }
        if (this.tantargyakSzama - ertek < 0) {
            throw new IllegalArgumentException("A tantárgyak száma nem lehet negatív!");
        }
        this.tantargyakSzama -= ertek;
    }

    public void novelFizetes(double szazalek) {
        if (szazalek < 0) {
            throw new IllegalArgumentException("A százalékos növelés értékének pozitívnak kell lennie!");
        }
        this.fizetes += this.fizetes * szazalek / 100;
    }

    public String getKategoriya() {
        double pontszam = this.tantargyakSzama * 1.0 + this.publikaciokSzama * 0.5;
        if (pontszam < 5) {
            return "alap";
        } else if (pontszam <= 10) {
            return "közép";
        } else {
            return "felső";
        }
    }

    @Override
    public String toString() {
        return "Oktató:" + "\n" +
               "név='" + nev + "'" + "\n" +
               "neptunKod='" + neptunKod + "'" + "\n" +
               "életkor=" + eletkor + "\n" +
               "egyetem='" + egyetem + "'" + "\n" +
               "intézet='" + intezet + "'" + "\n" +
               "beosztás='" + beosztas + "'" + "\n" +
               "tantárgyak száma=" + tantargyakSzama + "\n" +
               "fizetés=" + fizetes + "\n" +
               "publikációk száma=" + publikaciokSzama;
    }
}
