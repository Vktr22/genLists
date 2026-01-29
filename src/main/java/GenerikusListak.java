import java.util.ArrayList;
import java.util.List;

public class GenerikusListak {
    public static final int MAX_EGESZ_DB = 10;
    private List<Integer> egeszek;

    public GenerikusListak() {
        this(new ArrayList<>());
    }

    /* dependency injection --> kstr-ban adatot juttatunk be
    ez a tesztelhetőség miatt kell. Lehetne setter is, ha az nem probléma
    azért kell paraméter, hogy saját listával is tudjuk tessztelni a páratlan kikszedést.
    ld.: a tesztesetek
     */
    public GenerikusListak(List<Integer> egeszek) {
        this.egeszek = egeszek;
        feltolt();
    }

    public List<Integer> getEgeszek() {
        return egeszek;
    }

    /* csak párosak legyenek a listában, de
    nem lehet másik adatszerkezetet használni,
    ebből kell kitörölni a feleslegeseket!
     */
    public List<Integer> getParos(){
        for (int i = egeszek.size()-1; i >=0 ; i--) {
            if(egeszek.get(i) % 2 == 1){
                egeszek.remove(i);
            }
        }
        return egeszek;
    }

    /* private, nem fogjuk -nem is lehet - tesztelni */
    private void feltolt() {
        int indul = egeszek.size();
        for (int i = indul; i < 10; i++) {
            int ketjegyu = (int)(Math.random()*(99-10+1)+10);
            egeszek.add(ketjegyu);
        }
        if(indul > MAX_EGESZ_DB){
            for (int i = MAX_EGESZ_DB-1; i < egeszek.size(); i++) {
                egeszek.remove(i);
            }
        }
    }
}
