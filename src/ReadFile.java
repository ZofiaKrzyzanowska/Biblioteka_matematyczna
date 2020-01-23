import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Klasa sluzaca do wczytywania pliku z macierza z klawiatury.
 */
public class ReadFile {

    private static double x = 0;
    private static double y = 0;
    private static double [][] m;

    public static double[][] getM() {
        return m;
    }

    public static void Read (){

        System.out.println("Podaj plik z macierzą");

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName))) {
            String line = "";
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i==0){
                    StringTokenizer token = new StringTokenizer(line);
                    x = Double.valueOf((String)token.nextElement());
                    y = Double.valueOf((String)token.nextElement());
                    m = new double[(int) x][(int) y];
                }
                else {
                    int j = 0;
                    char[] stringToCharArray = line.toCharArray();
                    for (char output : stringToCharArray) {
                        if(output != ' '){
                            m[i-1][j] = (double)Character.getNumericValue(output);
                            j++;
                        }
                    }
                }
                i++;
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}