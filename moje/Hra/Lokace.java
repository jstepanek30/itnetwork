package Hra;

public class Lokace {
    String název;
    String popis;

    Lokace strany[] = new Lokace[4];

    public Lokace(String název, String popis) {
        this.název = název;
        this.popis = popis;
    }

    public void nastavStrany(Lokace moznosti, int pozice){
        strany[pozice] = moznosti;
    }

    public String getNázev() {
        return název;
    }

    public String getPopis() {
        return popis;
    }

    public Lokace[] getStrany() {
        return strany;
    }
}
