import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Wybierz działanie jakie chciałbyś wykonać:");
        System.out.println("1-Dodawanie macierzy");
        System.out.println("2-Odejmowanie macierzy");
        System.out.println("3-Transpozycja macierzy");
        System.out.println("4-Mnożenie macierzy przez skalar");
        System.out.println("5-Obliczenie wyznacznika macierzy");
        System.out.println("6-Sprawdzenie czy macierze są równe");
        System.out.println("7-Wypisanie macierzy");
        System.out.println("0-Wyłączenie programu");
       int a=scan.nextInt();
        if(a==1) {
            System.out.println("Podaj wielkość macierzy:");

            Scanner scan2=new Scanner(System.in);
            int b=scan2.nextInt();
            int c=scan2.nextInt();
            Matrix pierwsza=new Matrix(b,c);
            Matrix druga=new Matrix(b,c);

        }

    }




}
