package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** DONE
 * Created by adam- on 01/08/2016.
 *
 * BIPARTITE GRAPH CHECK :
 *  _ Simple check
 *
 */
public class BipartiteGraphCheck_Claw_Decomposition {

    static int N,a,b,c;

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        while( ( N = S.nextInt() ) != 0 ){

            ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

            for (int v = 0 ; v <= N ; v++){
                A.add(new ArrayList<Integer>());
            }

            do {
                a=S.nextInt();
                b=S.nextInt();
                A.get(a).add(b);
                A.get(b).add(a);
            } while ( a != 0);

            int [] V =new int [N+1];

            Queue<Integer> Q = new LinkedList<Integer>();

            Q.add(1);
            V[1]=1;

            String res="YES";

            ok:
            while( !Q.isEmpty() ){

                c = Q.remove();

                for ( int n : A.get(c) ){

                    if ( V[n] == 0){
                        V[n] = V[c] * -1;
                        Q.add(n);
                    }else if( V[n] == V[c]){
                        res= "NO";
                        break ok;
                    }

                }

            }

            System.out.println(res);

        }

    }

}
