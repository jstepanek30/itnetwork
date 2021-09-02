package Naklad;

public class Naklad {
    public static void main(String[] args) {
        NakladniAuto n = new NakladniAuto();
        n.nalozit(10000);
        n.nalozit(500);
        n.vylozit(300);
        n.vylozit(1000);
        System.out.println("V nákladním autě je naloženo "+n.vypisNaklad()+" kg");
    }
}
