package Nabeul_Camp.A2OJ_Contest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by adam- on 20/07/2016.
 */
public class Knight_Moves {

    static int dj [] = {2,2,1,-1,1,-1,-2,-2};
    static int di [] = {1,-1,2,2,-2,-2,1,-1};

    public static class Position{

        public int I;
        public int J;

        public Position(String X){
            this.I = ( (int)X.charAt(0) ) - 97;
            this.J = ( (int)X.charAt(1) ) - 49;
        }

        public Position(int i, int j){
            this.I = i;
            this.J = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Position position = (Position) o;

            if (I != position.I) return false;
            return J == position.J;

        }

        public String toString(){

            return " POITION : " + I + " , "+ J;

        }

    }

    public static boolean inBorders(int i, int j){
        return i < 8 && j < 8 && i >= 0 && j >= 0 ;
    }

    public static void main ( String [] args) {

        Scanner S = new Scanner(System.in);

        Position FROM,TO;

        while(S.hasNext()){

            int [][] M = new int [8][8];


            String from, to ;

            from = S.next();
            to   = S.next();

            FROM = new Position( from );
            TO = new Position( to );

            //System.out.println(FROM);
           // System.out.println(TO);

            Queue<Position> Q = new LinkedList<Position>();

            Q.add(FROM);
            M[FROM.I][FROM.J] = 1;

            boolean ok = false;

            while(!ok){

                Position Current = Q.remove();

                for (int i = 0 ; i < 8 ; i++ ){

                    int ni = Current.I+di[i];
                    int nj = Current.J+dj[i];

                    if ( inBorders(ni ,nj) && M[ni][nj] == 0 ){
                        Q.add(new Position(ni,nj));
                        M[ni][nj] = M[Current.I][Current.J]+1;
                    }

                    if( ni == TO.I && nj == TO.J ){
                        ok = true;
                        i=8;
                    }

                }

            }

            System.out.println("To get from "+from+" to "+to+" takes " + ( M[TO.I][TO.J] + -1 )+" knight moves." );

        }

    }
}
