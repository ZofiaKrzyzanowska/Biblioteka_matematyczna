import java.util.Scanner;

/**
 * Program testujacy dzialanie klasy Matrix i wszystkich metod w niej zawartych.
 * Wykonuje podstawowe dzialania na macierzach:  dodawania, odejmowania, mnożenia przez skalar, transpozycji, definiowania wyznacznika, sprawdzanie czy sa rowne, wypisywania.
 * Wczytuje macierze z klawiatury, albo z pliku tekstowego.
 */
public class Program {

    /**
     * Przykladowy program z wykorzystaniem klasy Matrix.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); /** Rozpoczęcie pracy skanera */
        System.out.println("Wybierz działanie jakie chciałbyś wykonać:");
        System.out.println("1-Dodawanie macierzy");
        System.out.println("2-Odejmowanie macierzy");
        System.out.println("3-Transpozycja macierzy");
        System.out.println("4-Mnożenie macierzy");
        System.out.println("5-Mnożenie macierzy przez skalar");
        System.out.println("6-Obliczenie wyznacznika macierzy");
        System.out.println("7-Sprawdzenie czy macierze są równe");
        System.out.println("8-Wypisanie macierzy");
        System.out.println("Inna liczba-Wyłączenie programu");
        int a = scan.nextInt(); /** Wybór działania */
        switch (a) {
            case 1: {
                boolean end = false;
                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();

                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkosc macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            double[][] drugaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy drugiej na pozycji [" + i + "][" + j + "]:");
                                    drugaM[i][j] = scan2.nextDouble();
                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            Matrix drugaMa = new Matrix(drugaM);
                            Matrix suma = pierwszaMa.addition(drugaMa);
                            suma.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            ReadFile mat2 = new ReadFile();
                            mat2.Read();
                            Matrix Mat2 = new Matrix(ReadFile.getM());

                            Matrix suma = Mat1.addition(Mat2);
                            suma.show();
                        }
                        break;
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }
            case 2: {
                boolean end = false;
                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();
                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            double[][] drugaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy drugiej na pozycji [" + i + "][" + j + "]:");
                                    drugaM[i][j] = scan2.nextDouble();

                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            Matrix drugaMa = new Matrix(drugaM);
                            Matrix roznica = pierwszaMa.subtraction(drugaMa);
                            roznica.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            ReadFile mat2 = new ReadFile();
                            mat2.Read();
                            Matrix Mat2 = new Matrix(ReadFile.getM());

                            Matrix roznica = Mat1.subtraction(Mat2);
                            roznica.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }

            case 3: {
                boolean end = false;
                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();

                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);

                            Matrix transpozycja = pierwszaMa.transposition();
                            transpozycja.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            Matrix transpozycja = Mat1.transposition();
                            transpozycja.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }

            case 4: {
                boolean end = false;

                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();

                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            double[][] drugaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy drugiej na pozycji [" + i + "][" + j + "]:");
                                    drugaM[i][j] = scan2.nextDouble();

                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            Matrix drugaMa = new Matrix(drugaM);
                            Matrix mnozenie = pierwszaMa.multiplication(drugaMa);
                            mnozenie.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            ReadFile mat2 = new ReadFile();
                            mat2.Read();
                            Matrix Mat2 = new Matrix(ReadFile.getM());

                            Matrix mnozenie = Mat1.multiplication(Mat2);
                            mnozenie.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }

            case 5: {
                boolean end = false;

                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();

                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            System.out.println("Wprowadź wartość skalara:");
                            double scal = scan2.nextInt();

                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            Matrix mnozeniescalar = pierwszaMa.scalar(scal);
                            mnozeniescalar.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Wprowadź wartość skalara:");
                            double scal = scan2.nextInt();

                            Matrix mnozeniescalar = Mat1.scalar(scal);
                            mnozeniescalar.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }
            case 6: {
                boolean end = false;

                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();

                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);

                            Matrix wyznacznik = pierwszaMa.determinant();
                            wyznacznik.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            Matrix wyznacznik = Mat1.determinant();
                            wyznacznik.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }

            case 7: {
                boolean end = false;

                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();
                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            double[][] drugaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy drugiej na pozycji [" + i + "][" + j + "]:");
                                    drugaM[i][j] = scan2.nextDouble();

                                }
                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            Matrix drugaMa = new Matrix(drugaM);
                            boolean rowna = pierwszaMa.eq(drugaMa);
                            if (rowna) System.out.println("Macierze są równe");
                            else System.out.println("Macierze nie są równe");
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            ReadFile mat2 = new ReadFile();
                            mat2.Read();
                            Matrix Mat2 = new Matrix(ReadFile.getM());

                            boolean rowna = Mat1.eq(Mat2);
                            if (rowna) System.out.println("Macierze są równe");
                            else System.out.println("Macierze nie są równe");
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }

            case 8: {
                boolean end = false;
                do {
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("0-Przerwij program");
                    System.out.println("1-Macierz wprowadzona z klawiatury");
                    System.out.println("2-Macierz wprowadzona z pliku");
                    int d = scan3.nextInt();
                    switch (d) {
                        case 0: {
                            end = true;
                            break;
                        }
                        case 1: {
                            end = true;
                            System.out.println("Podaj wielkość macierzy:");

                            Scanner scan2 = new Scanner(System.in);
                            System.out.println("Liczba kolumn:");
                            int b = scan2.nextInt();
                            System.out.println("Liczba wierszy:");
                            int c = scan2.nextInt();
                            double[][] pierwszaM = new double[b][c];
                            for (int i = 0; i < b; i++)
                                for (int j = 0; j < c; j++) {
                                    System.out.println("Wprowadź wartość macierzy pierwszej na pozycji [" + i + "][" + j + "]:");
                                    pierwszaM[i][j] = scan2.nextDouble();
                                }

                            Matrix pierwszaMa = new Matrix(pierwszaM);
                            pierwszaMa.show();
                            break;
                        }
                        case 2: {
                            end = true;
                            ReadFile mat1 = new ReadFile();
                            mat1.Read();
                            Matrix Mat1 = new Matrix(ReadFile.getM());

                            Mat1.show();
                            break;
                        }
                        default: {
                            System.out.println("Wybór nieprawidłowy spróbuj jeszcze raz");
                            break;
                        }
                    }
                }
                while (end == false);
                break;
            }
        }
    }
}