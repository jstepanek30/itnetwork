package PesOsoba;

public class PesOsoba {
    public static void main(String[] args) {
        Pes pes = new Pes("Bubí", 1);
        System.out.println(pes);
        Osoba karlos = new Osoba(pes,"Karlos");
        Osoba aneta = new Osoba(pes,"Anetka");
        karlos.getPes().zestarni();
        aneta.getPes().zestarni();
        System.out.println(pes);

    }
}
