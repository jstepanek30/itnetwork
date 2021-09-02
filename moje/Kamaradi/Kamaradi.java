package Kamaradi;

public class Kamaradi {
    public static void main(String[] args) {
        Clovek karel = new Clovek();
        karel.jmeno = "Karel Novák";
        karel.vek = 33;
        Clovek josef = new Clovek();
        josef.jmeno = "Josef Nový";
        josef.vek = 27;
        karel.kamarad = josef.jmeno;
        josef.kamarad = karel.jmeno;
        System.out.println(karel.predstaveni());
        System.out.println(josef.predstaveni());
    }

}
