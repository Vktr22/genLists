import java.util.Arrays;
import java.util.List;

public class Osztalyzatok {

    public static void main(String[] args) {
        //feladat: nevek jegyek 2lista nem privat adattag lista ne legyen módosítható + írj rá kiíró metódust, statik, +átadható legyen + legyen benne main
        //immutable adat - lista nem modosithato
       // List<String> nevek = List.of("Ede", "Pál");
       // List<Double> atlagok = List.of(3.14, 2.65);
        //feladat: listat atadni aminek az elso elemet at lehet irni

//        hozzaad(nevek, "Pisti");
//        hozzaad(atlagok, 4.56);

        List<String> nevek = Arrays.asList("Ede", "Pál");
        List<Double> atlagok = Arrays.asList(3.14, 2.65);

        listaKiir(atlagok);
        listaKiir(nevek);

        atir(nevek, "Pisti");
        atir(atlagok, 2.11);

        listaKiirMetodusReferenciaval(nevek);
        listaKiirMetodusReferenciaval(atlagok);

    }

    static <T> void atir(List<T> lista, T ujErtek) {
        if (lista == null) {
            throw new IllegalArgumentException("A lista nem lehet null.");
        }
        if (lista.isEmpty()) {
            System.out.println("A lista üres, nincs mit átírni.");
            return;
        }
        lista.set(0, ujErtek);
    }


    /*static void listaKiir(List<Double> atlagok) {       //ez
        for (Double elem : lista) {
            System.out.println(elem + " ");
        }
        System.out.println();

    }
    static void listaKiir(List<String> nevek) {           //meg ez ua, csak a típus kül., ezért <?> + Object elem --------ez a generikus (h ne legyen kódismétlés
        for (Double elem : lista) {
            System.out.println(elem + " ");
        }
        System.out.println();

    }*/
    static void listaKiir(List<?> lista) {
        for (Object elem : lista) {
            System.out.println(elem + " ");
        }
        System.out.println();

    }
    static <T> void hozzaad(List<T> lista, T elem){             //T valamilyen típus lesz majd ---típus paraméter lista-val List<T>--> generikus lista es fontos, h nagybetűs, csomagos típust(pl Integer) vesz át, nem egyszerű típusokat(pl int)
        lista.add(elem);
    }

    static <T> void listaKiirMetodusReferenciaval(List<T> lista){
        //hagyományos metódus paraméterrel:
        /*for (T elem : lista){
            System.out.println(elem);
        }*/

        //metódus referenciaval:
        lista.forEach(System.out::println);
    }


}
