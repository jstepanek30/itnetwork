package Hra;

public class Lokace {
    String název;
    String popis;

    Lokace jih;
    Lokace vychod;
    Lokace zapad;
    Lokace sever;

    public Lokace(String název, String popis) {
        this.název = název;
        this.popis = popis;
    }

    public void setJih(Lokace jih) {
        this.jih = jih;
    }

    public void setVychod(Lokace vychod) {
        this.vychod = vychod;
    }

    public void setZapad(Lokace zapad) {
        this.zapad = zapad;
    }

    public void setSever(Lokace sever) {
        this.sever = sever;
    }

    public String getNázev() {
        return název;
    }

    public String getPopis() {
        return popis;
    }
}
