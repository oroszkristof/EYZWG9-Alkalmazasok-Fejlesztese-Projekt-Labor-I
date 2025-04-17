package Termék;

public class Termek {
    private int azonosito;
    private String nev;
    private double ar;
    private String gyarto;

    public Termek(int azonosito, String nev, double ar, String gyarto) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.ar = ar;
        this.gyarto = gyarto;
    }

    public int getAzonosito() { return azonosito; }
    public String getNev() { return nev; }
    public double getAr() { return ar; }
    public String getGyarto() { return gyarto; }

    public void setAzonosito(int azonosito) { this.azonosito = azonosito; }
    public void setNev(String nev) { this.nev = nev; }
    public void setAr(double ar) { this.ar = ar; }
    public void setGyarto(String gyarto) { this.gyarto = gyarto; }

    public static Termek magasabbAru(Termek t1, Termek t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        return (t1.ar >= t2.ar) ? t1 : t2;
    }

    public static Termek legolcsobbTermek(Termek[] tomb) {
        if (tomb == null || tomb.length == 0) return null;
        Termek legolcsobb = tomb[0];
        for (Termek t : tomb) {
            if (t != null && t.ar < legolcsobb.ar) {
                legolcsobb = t;
            }
        }
        return legolcsobb;
    }

    public static Termek[] gyartoAlapjan(Termek[] tomb, String gyarto) {
        if (tomb == null || gyarto == null) return new Termek[0];
        java.util.List<Termek> talalatok = new java.util.ArrayList<>();
        for (Termek t : tomb) {
            if (t != null && gyarto.equals(t.gyarto)) {
                talalatok.add(t);
            }
        }
        return talalatok.toArray(new Termek[0]);
    }
}

class Edesseg extends Termek {
    private double suly;
    private double cukorTartalom;
    private double kakaoTartalom;

    public Edesseg(int azonosito, String nev, double ar, String gyarto,
                   double suly, double cukorTartalom, double kakaoTartalom) {
        super(azonosito, nev, ar, gyarto);
        this.suly = suly;
        this.cukorTartalom = cukorTartalom;
        this.kakaoTartalom = kakaoTartalom;
    }

    public double getSuly() { return suly; }
    public void setSuly(double suly) { this.suly = suly; }
    public double getCukorTartalom() { return cukorTartalom; }
    public void setCukorTartalom(double cukorTartalom) { this.cukorTartalom = cukorTartalom; }
    public double getKakaoTartalom() { return kakaoTartalom; }
    public void setKakaoTartalom(double kakaoTartalom) { this.kakaoTartalom = kakaoTartalom; }
}

class Pekaru extends Termek {
    private double suly;

    public Pekaru(int azonosito, String nev, double ar, String gyarto, double suly) {
        super(azonosito, nev, ar, gyarto);
        this.suly = suly;
    }

    public double getSuly() { return suly; }
    public void setSuly(double suly) { this.suly = suly; }
}

class Tisztitoszer extends Termek {
    private String tipus;
    private double egysegar;

    public Tisztitoszer(int azonosito, String nev, double ar, String gyarto,
                        String tipus, double egysegar) {
        super(azonosito, nev, ar, gyarto);
        this.tipus = tipus;
        this.egysegar = egysegar;
    }

    public String getTipus() { return tipus; }
    public void setTipus(String tipus) { this.tipus = tipus; }
    public double getEgysegar() { return egysegar; }
    public void setEgysegar(double egysegar) { this.egysegar = egysegar; }

    public static Tisztitoszer[] tipusSzerint(Tisztitoszer[] tomb, String tipus) {
        if (tomb == null || tipus == null) return new Tisztitoszer[0];
        java.util.List<Tisztitoszer> list = new java.util.ArrayList<>();
        for (Tisztitoszer t : tomb) {
            if (t != null && tipus.equals(t.tipus)) {
                list.add(t);
            }
        }
        return list.toArray(new Tisztitoszer[0]);
    }

    public static double atlagEgysegar(Tisztitoszer[] tomb, String tipus) {
        if (tomb == null || tipus == null) return 0;
        double sum = 0;
        int count = 0;
        for (Tisztitoszer t : tomb) {
            if (t != null && tipus.equals(t.tipus)) {
                sum += t.egysegar;
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public static Tisztitoszer[] olcsobbMintAtlag(Tisztitoszer[] tomb, String tipus) {
        double atlag = atlagEgysegar(tomb, tipus);
        if (tomb == null || tipus == null) return new Tisztitoszer[0];
        java.util.List<Tisztitoszer> list = new java.util.ArrayList<>();
        for (Tisztitoszer t : tomb) {
            if (t != null && tipus.equals(t.tipus) && t.egysegar < atlag) {
                list.add(t);
            }
        }
        return list.toArray(new Tisztitoszer[0]);
    }
}

