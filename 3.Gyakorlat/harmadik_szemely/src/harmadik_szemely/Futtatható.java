package harmadik_szemely;

public class Futtatható {
    public static void main(String[] args) {
        harmadik_szemely szemely1 = new harmadik_szemely("Orosz Kristóf", 21, 300, "Szerencs", 0);
        harmadik_szemely szemely2 = new harmadik_szemely("Kovács Péter", 18, "Szerencs", 0);
        System.out.println(szemely1.getNev() + " tanuló? " + (szemely1.isTanulo() ? "Igen" : "Nem"));
        System.out.println(szemely2.getNev() + " tanuló? " + (szemely2.isTanulo() ? "Igen" : "Nem"));
        System.out.println(szemely1.getNev() + " fizetési kategóriája: " + szemely1.getFizetesiKategoria());
        System.out.println(szemely2.getNev() + " fizetési kategóriája: " + szemely2.getFizetesiKategoria());
        System.out.println("Fizetés emelés 10%-kal:");
        szemely1.fizetesEmeles(10);
        System.out.println(szemely1.getNev() + " új fizetése: " + szemely1.getFizetes());
        
    }
}
