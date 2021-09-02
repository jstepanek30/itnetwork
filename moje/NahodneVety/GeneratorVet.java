package NahodneVety;

import java.util.Random;

public class GeneratorVet {
    private String[] podmety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    private String[] prisudky = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    private String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    private String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se zpožděním"};
    private String[] prislovecnaUrceniMista = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};

    public String putTogetherSentence(){
        Random rn = new Random();
        return privlastky[rn.nextInt(privlastky.length)]+" "+
                podmety[rn.nextInt(podmety.length)]+" "+
                prislovce[rn.nextInt(prislovce.length)]+" "+
                prisudky[rn.nextInt(prisudky.length)]+" "+
                prislovecnaUrceniMista[rn.nextInt(prislovecnaUrceniMista.length)];
    }

}
