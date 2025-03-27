package harmadik_szemely;


	public class harmadik_szemely {
	    private String nev;
	    private int eletkor;
	    private double fizetes;
	    private String lakcim;
	    private int gyerekekSzama;

	    public harmadik_szemely(String nev, int eletkor, double fizetes, String lakcim, int gyerekekSzama) {
	        setNev(nev);
	        setEletkor(eletkor);
	        setFizetes(fizetes);
	        setLakcim(lakcim);
	        setGyerekekSzama(gyerekekSzama);
	    }

	    public harmadik_szemely(String nev, int eletkor, String lakcim, int gyerekekSzama) {
	        this(nev, eletkor, 0, lakcim, gyerekekSzama);
	    }

	    public boolean isTanulo() {
	        return this.fizetes == 0;
	    }

	    public String getFizetesiKategoria() {
	        if (this.fizetes < 0) {
	            return "nem megfelelő a fizetés";
	        } else if (this.fizetes == 0) {
	            return "tanuló";
	        } else if (this.fizetes > 0 && this.fizetes < 300) {
	            return "alap";
	        } else if (this.fizetes >= 300 && this.fizetes <= 500) {
	            return "közép";
	        } else if (this.fizetes > 500) {
	            return "prémium";
	        }
	        return "nem megfelelő a fizetés";
	    }

	    public void fizetesEmeles(double szazalek) {
	        if (szazalek < 0) {
	            System.out.println("A százalékos emelés nem lehet negatív.");
	            return;
	        }
	        this.fizetes += this.fizetes * szazalek / 100;
	    }

	    public String getNev() {
	        return nev;
	    }

	    public void setNev(String nev) {
	        if (nev == null || nev.trim().isEmpty()) {
	            throw new IllegalArgumentException("Név nem lehet üres.");
	        }
	        this.nev = nev;
	    }

	    public int getEletkor() {
	        return eletkor;
	    }

	    public void setEletkor(int eletkor) {
	        if (eletkor < 0) {
	            throw new IllegalArgumentException("Életkor nem lehet negatív.");
	        }
	        this.eletkor = eletkor;
	    }

	    public double getFizetes() {
	        return fizetes;
	    }

	    public void setFizetes(double fizetes) {
	        if (fizetes < 0) {
	            throw new IllegalArgumentException("Fizetés nem lehet negatív.");
	        }
	        this.fizetes = fizetes;
	    }

	    public String getLakcim() {
	        return lakcim;
	    }

	    public void setLakcim(String lakcim) {
	        if (lakcim == null || lakcim.trim().isEmpty()) {
	            throw new IllegalArgumentException("Lakcím nem lehet üres.");
	        }
	        this.lakcim = lakcim;
	    }

	    public int getGyerekekSzama() {
	        return gyerekekSzama;
	    }

	    public void setGyerekekSzama(int gyerekekSzama) {
	        if (gyerekekSzama < 0) {
	            throw new IllegalArgumentException("Gyerekek száma nem lehet negatív.");
	        }
	        this.gyerekekSzama = gyerekekSzama;
	    }

	    @Override
	    public String toString() {
	        return "Szemely [név=" + nev + ", életkor=" + eletkor + ", fizetés=" + fizetes + ", lakcím=" + lakcim + ", gyerekek száma=" + gyerekekSzama + "]";
	    }
	}


