package Lide;

public class Clovek {
    private String name;
    private int unava;

    public Clovek(String name) {
        this.name = name;
        this.unava = 0;
    }
    public void behani(int km){
        if (unava + km > 20) System.out.println("Jsem příliš unavený.");
        else setUnava(km+unava);
    }
    public void spanek(int hodiny){
        if (unava-hodiny<0) {
            setUnava(0);
            System.out.println("Vstavej!");
        }
        else setUnava(unava-hodiny);
    }

    private void setUnava(int unava) {
        this.unava = unava;
    }

    public int getUnava() {
        return unava;
    }

    @Override
    public String toString() {
        return name + " ("+unava+")";
    }
}
