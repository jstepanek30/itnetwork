package Kamaradi;

public class Clovek {
    String jmeno;
    int vek;
    String kamarad;

    public String predstaveni(){
        return "Ahoj, já jsem "
                + jmeno +", je mi "
                + vek+" let a můj kamarád je "
                + kamarad;
    }

    public String getJmeno() {
        return jmeno;
    }
}
