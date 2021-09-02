package TahovyBoj;

public class Boj {
    public static void main(String[] args) {
        Kostka kostka6 = new Kostka();
        Kostka kostkaX = new Kostka(10);
        System.out.println(kostka6);
        for (int i = 0; i < 15; i++) {
            System.out.print(kostka6.hod() + " ");
            if (i==14) System.out.println();
        }
        System.out.println(kostkaX);
        for (int i = 0; i < 15; i++) {
            System.out.print(kostkaX.hod() + " ");
        }
    }
}
