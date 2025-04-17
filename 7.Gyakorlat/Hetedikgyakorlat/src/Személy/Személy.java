package Személy;

public class Személy {
    private String nev;
    private int eletkor;
    private String lakcim;
    private String szigSzam;

    public Személy(String nev, int eletkor, String lakcim, String szigSzam) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.lakcim = lakcim;
        this.szigSzam = szigSzam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    public String getSzigSzam() {
        return szigSzam;
    }

    public void setSzigSzam(String szigSzam) {
        this.szigSzam = szigSzam;
    }

    @Override
    public String toString() {
        return "Szemely{" +
               "nev='" + nev + '\'' +
               ", eletkor=" + eletkor +
               ", lakcim='" + lakcim + '\'' +
               ", szigSzam='" + szigSzam + '\'' +
               '}';
    }

    public boolean idosebbMint(Szemely masik) {
        return this.eletkor > masik.eletkor;
    }

    public static Szemely idosebb(Szemely s1, Szemely s2) {
        return (s1.eletkor >= s2.eletkor) ? s1 : s2;
    }
}
