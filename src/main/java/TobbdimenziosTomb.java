import java.util.List;

public class TobbdimenziosTomb {
    private int[][] matrix;
    private int[][] fureszes;
    private final int[][] fm = new int[2][2];
    private int[][] im;

    public TobbdimenziosTomb() {
        this.matrix = new int[3][5];
        this.fureszes = new int[5][];
        this.im = new int[3][3];
        feltolt();
    }

    private void feltolt() {
        //fm[0][0] = 0; //ez van benne alapból

        matrix[1][2] = 1;


        for (int i = 0; i < fureszes.length; i++) {
            int db = (int)(Math.random()*10 + 1);
            fureszes[i] = new int[db];
        }
        int s = fureszes.length / 2;
        fureszes[s][fureszes[s].length / 2] = 1;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int[][] getFureszes() {
        return fureszes;
    }

    public int[][] getFm() {
        return fm;
    }

    /* im --> immutable tömböt szeretnék tesztelni */
    public int[][] getIm() {
        /* clone referenciát ad, de
        egydimenziós tömbnél, ha primitív típusú, akkor lehet jó
         */
        /* shallow copy: */
        //return im.clone(); //2D tömbre nem jó! mély másoalt (deep copy) kell

        /* deep copy: */
        int sorDb = im.length;
        int oszlDb = im[0].length;//csak mátrixnál
        int[][] uj = new int[sorDb][oszlDb];
        for (int sor = 0; sor < sorDb; sor++) {
            /* fűrészesnél itt: oszlDb = im[sor].length; */
            for (int oszl = 0; oszl < oszlDb; oszl++) {
                uj [sor][oszl] = im[sor][oszl];
            }
        }
        return uj;
    }
}
