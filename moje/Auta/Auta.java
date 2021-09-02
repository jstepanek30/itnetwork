package Auta;

public class Auta {
    public static void main(String[] args) {
        Auto auto = new Auto("123ABC", "bílá");
        Garaz garaz = new Garaz();
        auto.zaparkuj(garaz);
        System.out.println("V garáži je auto: "+garaz.getAuto().getSPZ());
    }
}
