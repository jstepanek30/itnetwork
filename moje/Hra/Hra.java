package Hra;

public class Hra {

        Lokace aktualniMisto;

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
        this.aktualniMisto = dum;
        init();
    }
    public void init(){
        hrad.nastavStrany(lesHrad,1);
        lesHrad.nastavStrany(lesniRozcesti,1);
        lesHrad.nastavStrany(hrad,3);
        lesniRozcesti.nastavStrany(lesRybník,1);
        lesniRozcesti.nastavStrany(lesDum,2);
        lesniRozcesti.nastavStrany(lesHrad,3);
        lesRybník.nastavStrany(rybník,1);
        lesRybník.nastavStrany(lesniRozcesti,3);
        rybník.nastavStrany(lesRybník,3);
        lesDum.nastavStrany(lesniRozcesti,0);
        lesDum.nastavStrany(dum,1);
        dum.nastavStrany(lesDum,3);
    }

    public Lokace getAktualniMisto() {
        return aktualniMisto;
    }

    public void setAktualniMisto(Lokace aktualniMisto) {
        this.aktualniMisto = aktualniMisto;
    }
}
