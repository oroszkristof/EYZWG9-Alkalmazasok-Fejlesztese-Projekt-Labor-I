package kiegeszitett_hallgato;

public class kiegeszitett_hallgato {
    private String nev;
    private String neptunKod;
    private double atlag;
    private int tantargyakSzama;
    private static double minOsztondijAtlag = 3.0;

    public kiegeszitett_hallgato(String nev, String neptunKod, double atlag, int tantargyakSzama) {
        this.nev = nev;
        this.neptunKod = neptunKod;
        this.atlag = atlag;
        this.tantargyakSzama = tantargyakSzama;
    }

    public kiegeszitett_hallgato(String nev, String neptunKod) {
        this(nev, neptunKod, 0.0, 0);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public int getTantargyakSzama() {
        return tantargyakSzama;
    }

    public void setTantargyakSzama(int tantargyakSzama) {
        this.tantargyakSzama = tantargyakSzama;
    }

    public void novelTantargyakSzama(int ertek) {
        this.tantargyakSzama += ertek;
    }

    public void csokkentTantargyakSzama(int ertek) {
        this.tantargyakSzama -= ertek;
        if (this.tantargyakSzama < 0) {
            this.tantargyakSzama = 0;
        }
    }

    public boolean nagyobbAtlag(kiegeszitett_hallgato masik) {
        return this.atlag > masik.atlag;
    }

    public boolean tobbTantargyatFelvet(kiegeszitett_hallgato masik) {
        return this.tantargyakSzama > masik.tantargyakSzama;
    }

    public static kiegeszitett_hallgato getMagasabbAtlagu(kiegeszitett_hallgato h1, kiegeszitett_hallgato h2) {
        return h1.getAtlag() >= h2.getAtlag() ? h1 : h2;
    }

    public static kiegeszitett_hallgato getTobbTantargyatFelvetto(kiegeszitett_hallgato h1, kiegeszitett_hallgato h2) {
        return h1.getTantargyakSzama() >= h2.getTantargyakSzama() ? h1 : h2;
    }

    public static void setMinOsztondijAtlag(double minAtlag) {
        minOsztondijAtlag = minAtlag;
    }

    public static double getMinOsztondijAtlag() {
        return minOsztondijAtlag;
    }

    public double osztondijTeljesitesiKulonbseg() {
        return this.atlag - minOsztondijAtlag;
    }

    @Override
    public String toString() {
        return "Név: " + nev + "\n" +
               "Neptun kód: " + neptunKod + "\n" +
               "Átlag: " + atlag + "\n" +
               "Tantárgyak száma: " + tantargyakSzama;
    }
}
