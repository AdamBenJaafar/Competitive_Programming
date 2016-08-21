package Nabeul_Camp.SPOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by adam- on 20/07/2016.
 *
 *
 *
 */
public class Minimum_Knight_Moves {

    static int dj [] = {2,2,1,-1,1,-1,-2,-2};
    static int di [] = {1,-1,2,2,-2,-2,1,-1};

    public static class Position{

        public int I;
        public int J;

        public Position(String X){
            this.I = (int)X.charAt(0)-97;
            this.J = (int)X.charAt(1)-49;
        }

        public Position(int i, int j){
            this.I = i;
            this.J = j;
        }

    }

    public static boolean inBorders(int i, int j){
        return i < 8 && j < 8 && i >= 0 && j >= 0 ;
    }

    public static void main ( String [] args) {

        Scanner S = new Scanner(System.in);

        int T = S.nextInt();

        Position FROM,TO;

        int [][] M = new int [8][8];

        for ( int t = 0 ; t < T ; t++ ){

            FROM = new Position( S.next() );
            TO = new Position( S.next() );

            Queue<Integer> Q = new LinkedList<Integer>();

            Q.add(FROM.I);
            Q.add(FROM.J);

            boolean ok = false;

            while(!ok && !Q.isEmpty() ){

                int curri = Q.remove();
                int currj = Q.remove();

                for (int i = 0 ; i < 8 ; i++ ){

                    int ni = curri+di[i];
                    int nj = currj+dj[i];

                    if ( inBorders(ni ,nj) &&  M[ni][nj] == 0 ){
                        Q.add(ni);
                        Q.add(nj);
                        M[ni][nj]=M[curri][currj]+1;
                    }

                    if( ni == TO.I && nj == TO.J){
                        ok = true;
                    }


                }

            }

            System.out.println(M[TO.I][TO.J]);

        }

    }
}
