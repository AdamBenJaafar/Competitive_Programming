package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.Scanner;

/**
 * Created by adam- on 03/08/2016.
 */
public class D1ArrayManipulation_Newspaper {

    static int T,L,A;
    static double R;
    static String X;

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        T = S.nextInt();



        for (int t = 0 ; t < T ; t++ ){

            R=0;

            double [] V = new double [500];

            L=S.nextInt();

            for ( int l = 0 ; l < L ; l++ ){

                V[(int)S.next().charAt(0)]=S.nextDouble();

            }

            A=S.nextInt();

            for ( int a = 0 ; a < A ; a++ ){

                X = S.nextLine();

                for ( int c = 0 ; c < X.length() ; c++ ){

                    R +=  V[(int)X.charAt(c)];

                }

            }

            System.out.println((R/100.0)+"$");

        }

    }

}
