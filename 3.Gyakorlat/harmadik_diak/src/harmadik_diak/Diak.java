package harmadik_diak;

public class Diak {
    private String nev;
    private int eletkor;
    private final String egyetem = "THE";
    
    public Diak(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }
    
    public String getNev() {
        return nev;
    }
    
    public int getEletkor() {
        return eletkor;
    }
    
    public String getEgyetem() {
        return egyetem;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }
    
    public void printInfo() {
        System.out.println("Diák neve: " + nev);
        System.out.println("Diák életkora: " + eletkor);
        System.out.println("Egyetem: " + egyetem);
    }
    
    public static void main(String[] args) {
        Diak diak = new Diak("Kristof", 21);
        diak.printInfo();
    }
}

