package Auta;

public class Auto {
    private String SPZ;
    private String barva;

    public Auto(String SPZ, String barva) {
        this.SPZ = SPZ;
        this.barva = barva;
    }

    public void zaparkuj(Garaz garaz){
        garaz.setAuto(this);
    }

    public String getSPZ() {
        return SPZ;
    }

    public String getBarva() {
        return barva;
    }
}
