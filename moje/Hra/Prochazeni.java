package Hra;

import java.util.Scanner;

public class Prochazeni {
    public static void main(String[] args) {
        Hra hra = new Hra();
        Scanner sc = new Scanner(System.in);

        mainLoop: while (true){
            System.out.println(hra.getAktualniMisto().getNázev());
            System.out.println(hra.getAktualniMisto().getPopis() + "\n");
            String rozhodovani = "Můžeš jít na";
            for (int i = 0; i < 4; i++) {
                if (hra.getAktualniMisto().getStrany()[i] != null){
                    switch (i){
                        case 0: rozhodovani = rozhodovani.concat(" sever");
                            break;
                        case 1: rozhodovani = rozhodovani.concat(" východ");
                            break;
                        case 2: rozhodovani = rozhodovani.concat(" jih");
                            break;
                        case 3: rozhodovani = rozhodovani.concat(" západ");
                            break;
                    }
                }

            }
            System.out.println(rozhodovani + "\n");
            System.out.println("Zadej příkaz:");
            String prikaz = sc.nextLine();
            switch (prikaz){
                case "jdi na sever":
                    if (hra.getAktualniMisto().getStrany()[0] == null){
                        System.out.println("Tímto směrem nelze jít.");
                        break;
                    }
                    hra.setAktualniMisto(hra.getAktualniMisto().getStrany()[0]);
                    break;
                case "jdi na vychod":
                    if (hra.getAktualniMisto().getStrany()[1] == null){
                        System.out.println("Tímto směrem nelze jít.");
                        break;
                    }
                    hra.setAktualniMisto(hra.getAktualniMisto().getStrany()[1]);
                    break;
                case "jdi na jih":
                    if (hra.getAktualniMisto().getStrany()[2] == null){
                        System.out.println("Tímto směrem nelze jít.");
                        break;
                    }
                    hra.setAktualniMisto(hra.getAktualniMisto().getStrany()[2]);
                    break;
                case "jdi na zapad":
                    if (hra.getAktualniMisto().getStrany()[3] == null){
                        System.out.println("Tímto směrem nelze jít.");
                        break;
                    }
                    hra.setAktualniMisto(hra.getAktualniMisto().getStrany()[3]);
                    break;
                case "konec":
                    System.out.println("Nasledanou");
                    break mainLoop;
                default:
                    System.out.println("Můj vstupní slovník neobsahuje tento příkaz.");
            }
        }

    }
}
