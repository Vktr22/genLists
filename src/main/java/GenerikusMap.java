import java.util.HashMap;

public class GenerikusMap {

    //kulcs -ertek parok
    //nincs add metódusa

    private HashMap<String, Integer> kulcsErtek;

    public static void main(String[] args) {
        System.out.println(new GenerikusMap().kulcsErtek);
    }

    public GenerikusMap() {
        kulcsErtek = new HashMap<>();
        kulcsErtek.put("Sql", 5);
        kulcsErtek.put("Prog", 4);
        kulcsErtek.put("Matek", 3);
    }
}
