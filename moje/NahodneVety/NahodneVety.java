package NahodneVety;

public class NahodneVety {
    public static void main(String[] args) {
        GeneratorVet gv = new GeneratorVet();
        for (int i = 0; i < 10; i++) {
            System.out.println(gv.putTogetherSentence());
        }
    }
}
