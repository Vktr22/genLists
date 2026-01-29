import java.util.ArrayList;

public class ListaListaban {
    private ArrayList<ArrayList<Integer>> kulso;

    public ArrayList<ArrayList<Integer>> getKulso() {
        return kulso;
    }

    public ArrayList<String> getTargyak() {
        return targyak;
    }

    private ArrayList<String> targyak;

    public ListaListaban() {
        targyak = new ArrayList<>();
        targyak.add("SQL");
        targyak.add("Prog");

        kulso = new ArrayList<>();
        kulso.add(new ArrayList<>());
        kulso.add(new ArrayList<>());
        kulso.add(new ArrayList<>());

        kulso.set(0,getSzamok(3,5));
        kulso.set(1,getSzamok(1,2));
        kulso.set(2,getSzamok(2,5));
    }

    public ArrayList<Integer> getSzamok(int tol, int ig) {
        ArrayList<Integer> szamok = new ArrayList<>();

        if(tol>ig){
            int tmp = tol;
            tol = ig;
            ig = tmp;
        }

        for (int i = tol; i <=ig ; i++) {
            szamok.add(i);
        }
        return szamok;
    }
}
