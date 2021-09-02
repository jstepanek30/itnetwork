package PesOsoba;

public class Osoba {
    private Pes pes;
    private String jmeno;

    public Osoba(Pes pes, String jmeno) {
        this.pes = pes;
        this.jmeno = jmeno;
    }

    public Pes getPes() {
        return pes;
    }

    public String getJmeno() {
        return jmeno;
    }
}
