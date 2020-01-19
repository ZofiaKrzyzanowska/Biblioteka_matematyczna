public class Matrix {

    private final int M;             // liczba wierszy
    private final int N;             // liczba kolumn
    private final double[][] data;   // tablica M-N

    // stworzenie macierzy M na N
    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new double[M][N];
    }

    // stworzenie macierzy dwuwymiarowej
    public Matrix(double[][] data) {
        M = data.length;
        N = data[0].length;
        this.data = new double[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                this.data[i][j] = data[i][j];
    }

    // copy constructor
    private Matrix(Matrix m1) {
        this(m1.data);
    }

    public Matrix transposition (){
        Matrix m1 = this;
        Matrix m3 = new Matrix(M, N);
        for (int i = 0; i<m1.M; i++){
            for (int j = 0; j<m1.N; j++){
                m3.data[j][i] = m1.data[i][j];
            }
        }
        return m3;
    }


    public Matrix addition (Matrix m2){

        Matrix m1 = this;
        Matrix m3 = new Matrix(M, N);

        if (m1.M == m2.M &&  m1.N == m2.N){
            for (int i = 0; i<m1.M; i++){
                for (int j = 0; j<m1.N; j++){
                    m3.data[i][j] = (m1.data[i][j] + m2.data[i][j]);
                }
            }

        } else {
            throw new RuntimeException("Macierze mają różne wymiary");
        }
        return m3;
    }

    public Matrix subtraction (Matrix m2){

        Matrix m1 = this;
        Matrix m3 = new Matrix(M, N);

        if (m1.M == m2.M &&  m1.N == m2.N){
            for (int i = 0; i<m1.M; i++){
                for (int j = 0; j<m1.N; j++){
                    m3.data[i][j] = (m1.data[i][j] - m2.data[i][j]);
                }
            }

        } else {
            throw new RuntimeException("Macierze mają różne wymiary");
        }
        return m3;
    }

    public Matrix scalar (double sca){
        Matrix m1 = this;
        Matrix m3 = new Matrix(M, N);

        for (int i = 0; i<m1.M; i++){
            for (int j = 0; j<m1.N; j++){
                m3.data[i][j] = (m1.data[i][j] * sca);
            }
        }
        return m3;
    }

    public Matrix multiplication (Matrix m2){
        Matrix m1 = this;
        Matrix m3 = new Matrix(M, N);

        if (m1.N == m2.M){
            for (int i = 0; i<m1.M; i++){
                for (int j = 0; j<m1.N; j++){
                    double temp = 0;
                    for (int k = 0; k < m2.M; k++) {
                        temp += (m1.data[i][k] * m2.data[k][j]);
                    }
                    m3.data[i][j] = temp;
                }
            }
        } else {
            throw new RuntimeException("Macierze mają niewłaściwe wymiary");
        }

        return m3;
    }

    public Matrix determinant() {
        Matrix m1 = this;
        Matrix det = new Matrix(M,N);

        if (m1.M == 1 && m1.N == 1) {
            det.data[0][0] = m1.data[0][0];
        } else if (m1.M != m1.N) {
            throw new RuntimeException("Macierz nie jest kwadratowa");
        } else if (m1.M == 2 && m1.N == 2) {
            det.data[0][0] = (m1.data[0][0] * m1.data[1][1] - m1.data[0][1] * m1.data[1][0]);
        } else {
            Matrix m3 = new Matrix((m1.M + (m1.M - 1)), m1.N);
            for (int i = 0, _i = 0; i < m3.M; i++, _i++) {
                for (int j = 0; j < m1.N; j++) {
                    if (_i < m1.M && j < m1.N) {
                        m3.data[i][j] = m1.data[_i][j];
                    } else {
                        _i = 0;
                        m3.data[i][j] = m1.data[_i][j];
                    }
                }
            }

            double product = 1;
            int _i;

            for (int i = 0; i < m1.M; i++) {
                _i = i;
                for (int j = 0; j < m1.data[0].length; j++) {
                    product *= m3.data[_i][j];
                    _i++;
                }
                det.data[0][0] += product;
                product = 1;
            }

            product = 1;
            for (int i = 0; i < m1.M; i++) {
                _i = i;
                for (int j = m1.N - 1; j >= 0; j--) {
                    product *= m3.N;
                    _i++;
                }
                det.data[0][0] -= product;
                product = 1;
            }
        }
        return det;
    }


    public boolean eq(Matrix m2) {
        Matrix m1 = this;
        if (m2.M != m1.M || m2.N != m1.N) return false;

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (m1.data[i][j] != m2.data[i][j]) return false;
        return true;
    }


}
