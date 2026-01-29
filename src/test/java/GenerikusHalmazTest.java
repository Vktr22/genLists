import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenerikusHalmazTest {


    private GenerikusHalmaz h;

    @BeforeEach
    void setUp() {
        h = new GenerikusHalmaz();
    }


    @Test
    void generalOtoslottoSzelveny() {

        // Act
        Set<Integer> szelveny = h.generalOtoslottoSzelveny(); // ha más a név, itt írd át

        // Assert 1: nem null
       // assertNotNull(szelveny, "A szelvény nem lehet null");

        // Assert 2: pontosan 5 szám
        assertEquals(5, szelveny.size(), "A szelvénynek pontosan 5 különböző számot kell tartalmaznia");

        // Assert 3: minden szám 1..90 tartományban
        for (int szam : szelveny) {
            assertTrue(szam >= 1 && szam <= 90,
                    "Minden számnak 1 és 90 között kell lennie, de ez kívül esett: " + szam);
        }

        // Assert 4: duplikáció nincs -> Set mérete 5 (ezt már ellenőriztük),
        // de ide külön üzenetet is adhatunk (nem kötelező)
        assertEquals(5, szelveny.stream().distinct().count(),
                "Nem lehet ismétlődő szám a szelvényben");

    }

    //TreeSet --rendezett
    //HashSet --rendezetlen
    //set-tel hivatkozunk a treesetre és a hashsetre, mint ahogy listával arrayListre
    // a Set egy interface, melynek vannak bizonyos metódusai, amiket tudni kell
    //pl a hash set implementálja a set-et
    //a set egy interface, ami megfogalmazza h egy halmaznak mit kell tudnia
    //AbstractSet
    //van egy interface, amit ,megvalósit egy absztrakt osztály, amire hivatkozik egy osztály
    //null mindenbe lehet ami referencia tipus--- deee a TreeSet -ben nem lehet null
    //halmaznak nincs gettere!! index alapján nem éred el, pl a 4. elem mindig más lesz, mert nincs sorba rendezve (mint egy zsák)
    //mi a hash--(matekosabb)
    //a TreeSet-nek van getFirst meg getLast
    //KASZTOLÁSOK!!!  ((TreeSet)h).get... ->így elérem, mert a . "pont"-nak magasabb a precedenciája, így->(TreeSet)h.get... már nem jó
    //szivárvány tábla
}