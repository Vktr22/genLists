import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerikusListakTest {

    GenerikusListak gl;

    @BeforeEach
    void setUp() {
        gl = new GenerikusListak();
    }

    @Test
    void testKstr10elemetLetrehoz(){
        int db = GenerikusListak.MAX_EGESZ_DB;
        assertEquals(db, gl.getEgeszek().size());

        gl = new GenerikusListak(new ArrayList<>());
        assertEquals(10, gl.getEgeszek().size());

        List<Integer> rovidLista = new ArrayList<>(List.of(1,4,5,7,10,11));
        gl = new GenerikusListak(rovidLista);
        assertEquals(10, gl.getEgeszek().size(), "kevesebb, mint 10 elem van");

        List<Integer> hosszuLista = new ArrayList<>(List.of(1,4,5,7,10,11, 45, 44, 32, 33, 5, 25));
        gl = new GenerikusListak(hosszuLista);
        assertEquals(10, gl.getEgeszek().size(), "több, mint 10 elem van");
    }

    @Test
    void testCsakParosak(){
        /* param nlk kstr tesztje: */
        for (int elem : gl.getParos()) {
            assertTrue(elem % 2 == 0, "maradt benne páratlan");
        }

        /* paraméteres kstr-ok tesztje: */
        List<Integer> csakParatlanok = new ArrayList<>(List.of(1,3,5,7,9,11));
        gl = new GenerikusListak(csakParatlanok);
        for (int elem : gl.getParos()) {
            assertTrue(elem % 2 == 0, "maradt benne páratlan");
        }

        List<Integer> csakParosak = new ArrayList<>(List.of(2,4,6));
        gl = new GenerikusListak(csakParosak);
        assertTrue(gl.getParos().size() == csakParosak.size(), "nem jól kezeli a párosakat");
    }

}