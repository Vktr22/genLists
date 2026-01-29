import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GenerikusHalmaz {
    //halmaz tulajdonsága: nem lehet benne 2 egyforma ---> a halmaz tud ilyet! halmaz adatszerkezet--->Set
        //halmaz = new HashSet<>();
        //van generikus és nem generikus verziója-- gen kell mert az tipusbiztos + modernebb
    private Set<Integer> halmaz;

    //feladat: szelvény generátor- 5ös lottó ->
        //tesztek erre: van e benne 5szám? minden szám [1;95] van e?


    public GenerikusHalmaz() {
    }

    public Set<Integer> getHalmaz() {
        return halmaz;
    }

    public GenerikusHalmaz(Set<Integer> halmaz) {
        this.halmaz = new HashSet<>();
    }

    public Set<Integer> generalOtoslottoSzelveny(){
        halmaz.clear();

        Random rnd = new Random();
        while (halmaz.size()<5){
            int szam = rnd.nextInt(90)+1;
            halmaz.add(szam);
        }

        return halmaz;
    }
}
