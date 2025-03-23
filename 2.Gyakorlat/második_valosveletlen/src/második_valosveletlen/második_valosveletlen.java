package második_valosveletlen;

	import java.util.Scanner;

	public class második_valosveletlen {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Kerem a szamok darabszamat: ");
	        int n = sc.nextInt();
	        double[] szamok = new double[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Kerem a " + (i + 1) + ". szamot: ");
	            szamok[i] = sc.nextDouble();
	        }
	        System.out.println("A 0,4 es 0,5 kozotti szamok:");
	        for (int i = 0; i < n; i++) {
	            if (szamok[i] >= 0.4 && szamok[i] <= 0.5) {
	                System.out.println(szamok[i]);
	            }
	        }
	        double osszeg = 0;
	        for (int i = 0; i < n; i++) {
	            osszeg += szamok[i];
	        }
	        double atlag = osszeg / n;
	        System.out.println("A szamok darabszama: " + n);
	        System.out.println("A szamok atlaga: " + atlag);
	        sc.close();
	    }
	}


