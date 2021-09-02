package Hra;

public class Hra {

        Lokace prochazeni;

        Lokace hrad = new Lokace("Hrad",
                "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\n" +
                        "Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");
        Lokace lesHrad = new Lokace("Les",
                "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                        "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace lesniRozcesti = new Lokace("Lesní rozcestí",
                "Nacházíš se na lesním rozcestí.");
        Lokace lesRybník = new Lokace("Les",
                "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                        "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace rybník = new Lokace("Rybník",
                "Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n" +
                        "od tebe je dřevěná plošina se stavidlem.");
        Lokace lesDum = new Lokace("Les",
                "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
                        "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace dum = new Lokace("Dům",
                "Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n" +
                        "z hromady vedle vstupních dveří.");


    public Hra() {
        this.prochazeni = dum;
        init();
    }
    public void init(){
        hrad.setVychod(lesHrad);
        lesHrad.setZapad(hrad);
        lesHrad.setVychod(lesniRozcesti);
        lesniRozcesti.setVychod(lesRybník);
        lesniRozcesti.setJih(lesDum);
        lesniRozcesti.setZapad(lesHrad);
        lesRybník.setZapad(rybník);
        lesRybník.setVychod(lesniRozcesti);
        lesDum.setZapad(dum);
        lesDum.setSever(lesniRozcesti);
        dum.setZapad(lesDum);
    }

    public Lokace getProchazeni() {
        return prochazeni;
    }
}
