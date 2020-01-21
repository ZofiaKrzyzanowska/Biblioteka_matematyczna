/**
 * Klasa sluzaca do przetestowania wypisywania macierzy.
 */
public class Write {

    /**
     * Wypisanie przykladowej macierzy
     * @param args
     */
    public static void main (String[] args){
        double [][] a = {{1, 2}, {3, 4}};
        Matrix A = new Matrix(a);
        A.show();
    }

}

