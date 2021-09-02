package PesOsoba;

public class Pes {
    private String jmeno;
    private int vek;

    public Pes(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public void  zestarni(){
        vek += 1;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    @Override
    public String toString() {
        return jmeno+" ("+vek+" let)";
    }
}
