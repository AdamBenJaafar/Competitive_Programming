package Codeforces.Round365D2;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by adam- on 04/08/2016.
 */
public class Mishka_And_Interesting_Sum {

    static int N,Q,a,b;

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        N=S.nextInt();

        int [] T = new int [N];

        for ( int n = 0 ; n < N ; n++ ){
            T[n]=S.nextInt();

            System.out.println(Integer.toBinaryString(T[n]));
        }
        System.out.println("________");
        int Q=S.nextInt();

        for ( int q = 0 ; q < Q ; q++ ){

            a = S.nextInt()-1;
            b = S.nextInt()-1;
            int R = T[a];

            for ( int i = a+1 ; i <= b ; i++){

                System.out.println(Integer.toBinaryString(R));

                R= (int) (R ^ T[i]);


                System.out.println(Integer.toBinaryString(T[i]));
                System.out.println("---------------------");
                System.out.println(Integer.toBinaryString(R));
                System.out.println();

            }

            System.out.println(R);

        }

    }

}
