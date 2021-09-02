package Naklad;

public class NakladniAuto {
    int nosnost = 3000;
    int naklad  = 0;

    public void nalozit(int mnozstvi){
        if (naklad + mnozstvi <= nosnost) naklad += mnozstvi;
    }
    public void vylozit(int mnozstvi){
        if (naklad - mnozstvi >= 0) naklad-=mnozstvi;
    }
    public int vypisNaklad(){
        return naklad;
    }

}
