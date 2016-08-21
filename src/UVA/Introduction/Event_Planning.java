package UVA.Introduction;

import java.util.Scanner;

/**
 * Created by adam- on 09/06/2016.
 *
 * COMPARING
 *
 */
public class Event_Planning {

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        while(S.hasNext()){

            long cost = -1;

            int N = S.nextInt();
            int B = S.nextInt();
            int H = S.nextInt();
            int W = S.nextInt();

            int [][] M = new int [H][W];
            int [] C = new int [H];

            for ( int h = 0 ; h < H ; h++ ){

                int c = 0;

                C[h]=S.nextInt();

                c = C[h]*N;

                for ( int w = 0 ; w < W ; w++ ){
                    M[h][w] = S.nextInt();

                    if ( M[h][w] >= N ){
                        if ( c <= B && ( c < cost || cost == -1 ) )
                            cost = c ;
                    }


                }

            }

            if( cost == -1 )
                System.out.println("stay home");
            else
                System.out.println(cost);

        }

    }

}
