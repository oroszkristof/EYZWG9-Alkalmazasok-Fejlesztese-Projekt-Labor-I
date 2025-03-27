package harmadik_Diak2;

public class Futtathato {
	
	    public static void main(String[] args) {
	    	harmadik_Diak2 diak1 = new harmadik_Diak2("Orosz Kristóf", "EYZWG9", 21, "THE", 150000);
	    	harmadik_Diak2 diak2 = new harmadik_Diak2("Kiss Péter", "ABC123", 31,"THE", 100000);
	        System.out.println(diak1.adatokKiir());
	        System.out.println("Tanrend: " + diak1.getTanrend());
	        System.out.println(diak2.adatokKiir());
	        System.out.println("Tanrend: " + diak2.getTanrend());
	        diak1.emelKoltseg(5000);
	        diak2.emelKoltseg(10000);
	        System.out.println("Költség emelése után:");
	        System.out.println(diak1.adatokKiir());
	        System.out.println(diak2.adatokKiir());
	    }
	}


