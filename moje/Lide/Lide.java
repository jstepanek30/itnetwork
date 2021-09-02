package Lide;

public class Lide {
    public static void main(String[] args) {
        Clovek karel = new Clovek("Karel Nový");
        System.out.println(karel);
        karel.behani(10);
        karel.behani(10);
        karel.behani(10);
        karel.spanek(10);
        karel.behani(9);
        System.out.println(karel.getUnava());
        System.out.println(karel);
    }
}
