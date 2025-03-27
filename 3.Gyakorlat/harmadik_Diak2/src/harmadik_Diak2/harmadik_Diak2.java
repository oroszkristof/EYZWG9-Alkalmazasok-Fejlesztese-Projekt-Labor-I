package harmadik_Diak2;

public class harmadik_Diak2 {
	    private String nev;
	    private String neptunKod;
	    private int eletkor;
	    private String egyetem;
	    private double koltseg;

	    public harmadik_Diak2(String nev, String neptunKod, int eletkor, String egyetem, double koltseg) {
	        this.nev = nev;
	        this.neptunKod = neptunKod;
	        this.eletkor = eletkor;
	        this.egyetem = "THE";
	        this.koltseg = koltseg;
	    }

	    public harmadik_Diak2(String nev, String neptunKod, int eletkor, double koltseg) {
	        this(nev, neptunKod, eletkor, "THE", koltseg);
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

	    public int getEletkor() {
	        return eletkor;
	    }

	    public void setEletkor(int eletkor) {
	        this.eletkor = eletkor;
	    }

	    public String getEgyetem() {
	        return egyetem;
	    }

	    public void setEgyetem(String egyetem) {
	        this.egyetem = "THE";
	    }

	    public double getKoltseg() {
	        return koltseg;
	    }

	    public void setKoltseg(double koltseg) {
	        this.koltseg = koltseg;
	    }

	    public String adatokKiir() {
	        return "Név: " + nev +
	               ", Neptun kód: " + neptunKod +
	               ", Életkor: " + eletkor +
	               ", Egyetem: " + egyetem +
	               ", Költség: " + koltseg;
	    }

	    public String getTanrend() {
	        return eletkor > 30 ? "levelező tanrend" : "nappali";
	    }

	    public void emelKoltseg(double ertek) {
	        this.koltseg += ertek;
	    }
	}


