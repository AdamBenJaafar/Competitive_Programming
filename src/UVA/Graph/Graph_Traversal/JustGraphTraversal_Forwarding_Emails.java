package UVA.Graph.Graph_Traversal;

import java.util.*;

/**
 * Created by adam- on 01/08/2016.
 *
 * JUST GRAPH TRAVERSAL:
 *
 */
public class JustGraphTraversal_Forwarding_Emails {

    static int C,M,R,MaxR,r,current;
    static int [] V;

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        C = S.nextInt();

        for ( int c = 1 ; c <= C ; c++ ){

            R = 0 ;
            MaxR = 0 ;

            M = S.nextInt();

            int [] T = new int [M+1];

            for ( int m = 0 ; m < M ; m++ ){
                T[S.nextInt()]=S.nextInt();
            }

            V = new int [M+1];

            for ( int m = 1 ; m <= M ; m++ ){

                r = 1;
                V[m]=m;

                current = T[m];

                while( V[current] != m ){
                    r++;
                    V[current] = m;
                    current = T[current];
                }

                if( r > R){
                    R=r ;
                    MaxR=m;
                }

            }

            System.out.println("Case "+c+": "+MaxR);

        }

    }

}
