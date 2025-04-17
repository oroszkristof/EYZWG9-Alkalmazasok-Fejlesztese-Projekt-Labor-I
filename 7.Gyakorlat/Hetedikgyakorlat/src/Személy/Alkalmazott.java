package Személy;

public class Alkalmazott extends Személy {
    private double fizetes;
    private String beosztas;
    private String munkahely;

    public Alkalmazott(String nev, int eletkor, String lakcim, String szigSzam,
                       double fizetes, String beosztas, String munkahely) {
        super(nev, eletkor, lakcim, szigSzam);
        this.fizetes = fizetes;
        this.beosztas = beosztas;
        this.munkahely = munkahely;
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(double fizetes) {
        this.fizetes = fizetes;
    }

    public String getBeosztas() {
        return beosztas;
    }

    public void setBeosztas(String beosztas) {
        this.beosztas = beosztas;
    }

    public String getMunkahely() {
        return munkahely;
    }

    public void setMunkahely(String munkahely) {
        this.munkahely = munkahely;
    }

    @Override
    public String toString() {
        return "Alkalmazott{" +
               "nev='" + getNev() + '\'' +
               ", eletkor=" + getEletkor() +
               ", lakcim='" + getLakcim() + '\'' +
               ", szigSzam='" + getSzigSzam() + '\'' +
               ", fizetes=" + fizetes +
               ", beosztas='" + beosztas + '\'' +
               ", munkahely='" + munkahely + '\'' +
               '}';
    }

    public boolean nagyobbFizetesuMint(Alkalmazott masik) {
        return this.fizetes > masik.fizetes;
    }

    public static Alkalmazott nagyobbFizetesu(Alkalmazott a1, Alkalmazott a2) {
        return a1.fizetes >= a2.fizetes ? a1 : a2;
    }

    public double evesFizetes() {
        return fizetes * 12;
    }

    public static double osszesEvesBerkoltseg(Alkalmazott[] alkalmazottak, String munkahely) {
        double ossz = 0;
        for (Alkalmazott a : alkalmazottak) {
            if (a.munkahely.equals(munkahely)) {
                ossz += a.evesFizetes();
            }
        }
        return ossz;
    }

    public double evesBerkoltsegAzonosBeosztasu(Alkalmazott[] alkalmazottak) {
        double ossz = 0;
        for (Alkalmazott a : alkalmazottak) {
            if (this.beosztas.equals(a.beosztas)) {
                ossz += a.evesFizetes();
            }
        }
        return ossz;
    }

    public double atlagosHaviBerkoltseg(Alkalmazott[] alkalmazottak) {
        return evesBerkoltsegAzonosBeosztasu(alkalmazottak) / 12;
    }
}

