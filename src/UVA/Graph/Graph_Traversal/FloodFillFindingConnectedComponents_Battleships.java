package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/** DONE
 * Created by adam- on 01/08/2016.$
 *
 * FLOOD FILL / FINDING CONNECTED COMPONENTS:
 *  _ Simple BFS on identified boat parts
 *
 */
public class FloodFillFindingConnectedComponents_Battleships {

    static int N,R,T;

    static String [] M;
    static int [] dx = { 0,1,0,-1};
    static int [] dy = { 1,0,-1,0};

    public static boolean inBorders(int x, int y){
        if( x < 0 || y < 0 || x == N || y == N )
            return false;
        return true;
    }

    public static boolean isBoat(int x, int y){
        if( M[x].charAt(y) == 'x' || M[x].charAt(y) == '@')
            return true;
        return false;
    }

    public static void main(String [] args){

        Scanner S = new Scanner(System.in);

        T = S.nextInt();

        for (int t = 1 ; t <= T ; t++){

            R=0;

            N = S.nextInt();

            M = new String [N];
            int [][] V = new int [N][N];

            ArrayList<Integer> A = new ArrayList<Integer>();

            for ( int n = 0 ; n < N ; n++ ){

                M[n] = S.next();

                for ( int i = 0 ; i < N ; i++ ){

                    if( M[n].charAt(i) == 'x')
                    {A.add(n); A.add(i); }

                }
            }

            //System.out.println(A);

            for ( int i = 0 ; i < A.size() /2 ; i++){

                int x = A.get(i*2);
                int y = A.get(i*2+1);

                 if ( V[x][y] != 1 ){

                     Queue<Integer> Q = new LinkedList<Integer>();
                     Q.add(x);
                     Q.add(y);
                     V[x][y]=1;
                     R++;

                     while(!Q.isEmpty()) {

                         int cx = Q.remove();
                         int cy = Q.remove();

                         for (int j = 0; j < 4; j++) {

                             if (inBorders(cx + dx[j], cy + dy[j]) && (V[cx + dx[j]][cy + dy[j]] != 1) && isBoat(cx+dx[j],cy+dy[j])){
                                 Q.add(cx + dx[j]);
                                 Q.add(cy + dy[j]);
                                 V[cx + dx[j]][cy + dy[j]] = 1;
                             }

                         }
                     }

                 }

            }


            System.out.println( "Case " + t + ": " + R);

        }

    }

}
