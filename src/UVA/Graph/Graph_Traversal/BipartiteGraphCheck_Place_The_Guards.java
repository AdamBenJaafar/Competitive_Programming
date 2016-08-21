package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** DONE
 * Created by adam- on 01/08/2016.
 *
 * BIPARTITE GRAPH CHECK :
 *  _ Need to check every sub-graph alone
 *  _ Nested loop quit
 *  _ Check single nodes alone
 *
 */
public class BipartiteGraphCheck_Place_The_Guards {

    static int T,J,R,a,b;

    public static void main( String [] args ){

        Scanner S = new Scanner(System.in);

        T = S.nextInt();

        for (int t = 0 ; t < T ; t++ ){

            J=S.nextInt();
            R=S.nextInt();

            ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

            for ( int j = 0 ; j < J ; j++ ){
                A.add(new ArrayList<Integer>());
            }

            for ( int r = 0 ; r < R ; r++ ){
                a = S.nextInt();
                b = S.nextInt();
                A.get(a).add(b);
                A.get(b).add(a);
            }

            int [] V = new int [J];

            R  = 0;

            end:
            for ( int j = 0 ; j < J ; j++ ){

                if ( V[j] == 0 ){

                    int r = 1;
                    int one = 1;

                    Queue<Integer> Q = new LinkedList<Integer>();

                    Q.add(j);
                    V[j]=1;

                    while( !Q.isEmpty() ){

                        a = Q.remove();

                        for ( int n : A.get(a) ){

                            if ( V[n] == 0 ) {
                                Q.add(n);
                                V[n] = V[a]*-1;
                                r++;
                                if(V[n]==1)
                                    one++;
                             }else if( V[n] == V[a] ){
                                R=-1;
                                break end;
                             }

                        }

                    }

                    //System.out.println(" R is now "+R + " r is now "+ r+ " One isn now "+one);
                     R += Math.min(r-one,one);

                }
            }

            if(R!=-1)
                for ( int i = 0 ; i < J ; i++)
                    if( A.get(i).size() == 0)
                        R++;

            System.out.println(R);

        }

    }

}
