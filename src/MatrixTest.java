import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * Klasa sluzaca do testowania klasy Matrix.
 */
class MatrixTest {

    @org.junit.jupiter.api.Test
    public void addition() {


        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{1, 2}, {3, 4}};
        double[][] c = {{2, 4}, {6, 8}};

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);

        Matrix actual = A.addition(B);
        Matrix expected = new Matrix(c);

        expected.equals(actual);

    }

    @Test
    void transposition() {

        double[][] a = {{-1, 2}, {3, 3}};
        double[][] c = {{-1, 3}, {2, 3}};

        Matrix A = new Matrix(a);

        Matrix actual = A.transposition();

        Matrix expected = new Matrix(c);

        expected.equals(actual);

    }

    @Test
    void subtraction() {

        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{1, 2}, {3, 4}};
        double[][] c = {{0, 0}, {0, 0}};

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);

        Matrix actual = A.subtraction(B);
        Matrix expected = new Matrix(c);

        expected.equals(actual);

    }

    @Test
    void scalar() {

        double[][] a = {{4, 2}, {3, 1}};
        double b = 2;
        double[][] c = {{8, 4}, {6, 2}};

        Matrix A = new Matrix(a);

        Matrix actual = A.scalar(b);
        Matrix expected = new Matrix(c);

        expected.equals(actual);

    }

    @Test
    void multiplication() {

        double[][] a = {{1, -1}, {2, 3}, {0.5, 1}};
        double[][] b = {{2, -0.5}, {2, 5}};
        double[][] c = {{0, -5.5}, {10, 14}, {3, 4.75}};

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);

        Matrix actual = A.multiplication(B);
        Matrix expected = new Matrix(c);

        expected.equals(actual);

    }


    @Test
    void determinant() {
        double[][] a = {{5, -1, 3}, {0, 1, -2}, {4, 3, 2}};
        double[][] c = {{36}};
        Matrix A = new Matrix(a);

        Matrix actual = A.determinant();
        Matrix expected = new Matrix(c);

        expected.equals(actual);
    }

    @Test
    void eq() {
        double[][] a = {{5, -1, 3}, {0, 1, -2}, {4, 3, 2}};
        double[][] b = {{5, -1, 3}, {0, 1, -2}, {4, 3, 2}};

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);

        boolean actual = A.eq(B);
        boolean expected = true;

        assertEquals(expected, actual);

    }

}