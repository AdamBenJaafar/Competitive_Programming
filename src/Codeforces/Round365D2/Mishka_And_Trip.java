package Codeforces.Round365D2;

import java.util.Scanner;

/**
 * Created by adam- on 04/08/2016.
 */
public class Mishka_And_Trip {

    static int V,C;

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        V = S.nextInt();
        C = S.nextInt();

        int [] B = new int [V];
        int [] CAP = new int [V];

        int R = 0 ;

        B[0]=S.nextInt();

        for ( int v = 1 ; v < V ; v++ ){
            B[v]=S.nextInt();
            R+=B[v-1]*B[v];
        }

        R+= B[0]*B[V-1];


        for ( int c = 0 ; c < C ; c++ ){

            int x= S.nextInt()-1;
            CAP[x] = 1;

            for ( int v = x+2 ; v < V ; v++ ){

                if ( CAP[v] == 0 ) {
                    R += B[x] * B[v];
                }

            }

            for ( int v = x-2 ; v >= 0 ; v-- ){

                if ( CAP[v] == 0 ) {
                    R += B[x] * B[v];
                }

            }

        }


        System.out.println(R);

    }

}
