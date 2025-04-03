package hallgato;

public class Hallgato {
    private String nev;
    private String neptunKod;
    private double atlag;
    private int tantargyakSzama;

    public Hallgato(String nev, String neptunKod, double atlag, int tantargyakSzama) {
        this.nev = nev;
        this.neptunKod = neptunKod;
        this.atlag = atlag;
        this.tantargyakSzama = tantargyakSzama;
    }

    public Hallgato(String nev, String neptunKod) {
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

    public boolean nagyobbAtlag(Hallgato masik) {
        return this.atlag > masik.atlag;
    }

    public boolean tobbTantargyatFelvet(Hallgato masik) {
        return this.tantargyakSzama > masik.tantargyakSzama;
    }

    @Override
    public String toString() {
        return "Név: " + nev + "\n" +
               "Neptun kód: " + neptunKod + "\n" +
               "Átlag: " + atlag + "\n" +
               "Tantárgyak száma: " + tantargyakSzama;
    }
}
