import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TobbdimenziosTombTest {

    TobbdimenziosTomb tt;

    @BeforeEach
    void setUp() {
        tt = new TobbdimenziosTomb();
    }

    @Test
    void testMatrixElsoElemNemNull() {
        System.out.println("matrix [0][0] != null");
        int kapott = tt.getMatrix()[0][0];
        assertNotNull(kapott, "[0][0] = null");
    }

    @Test
    void testFureszElsoElemNemNull() {
        System.out.println("furesz [0][0] != null");
        /* amíg nem írtuk meg:
        fail("nincs letesztelve!");
         */
        int kapott = tt.getFureszes()[0][0];
        assertNotNull(kapott, "[0][0] = null");
    }

    @Test
    void testLegalabbEgy_1_Matrixban(){
        int[][] m = tt.getMatrix();
        int sor = 0;
        int maxOszlop = m[sor].length;
        boolean talalat = false;
        while(sor < m.length && !talalat){
            int oszl = 0;
            while(oszl < maxOszlop && !(m[sor][oszl] == 1)){
                oszl++;
            }
            if(oszl<m[sor].length){
                talalat = true;
            }
            sor++;
        }
        assertTrue(talalat, "matrix: nincs benne 1");
    }

    @Test
    void testLegalabbEgy_1_Fureszben(){
        int[][] m = tt.getFureszes();
        int sor = 0;
        boolean talalat = false;
        while(sor < m.length && !talalat){
            int oszl = 0;
            while(oszl < m[sor].length && !(m[sor][oszl] == 1)){
                oszl++;
            }
            if(oszl<m[sor].length){
                talalat = true;
            }
            sor++;
        }
        assertTrue(talalat, "fureszes: nincs benne 1");
    }

    @Test
    @Disabled("Mindig elszáll, mert final nem immutable! ld az alábbi tesztet erre!")
    void testFinalTombErtekValtozasa(){
        int[][] fm = tt.getFm();
        fm[0][0] = 1;
        assertEquals(0, fm[0][0], "meg tudtam változtatni");
    }

    @Test
    void testTombErtekNemValtozhat(){
        int[][] im = tt.getIm();
        im[0][0] = 1;
        assertNotEquals(im[0][0], tt.getIm()[0][0], "változott az érték!");
    }
}