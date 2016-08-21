package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/** DONE
 * Created by adam- on 01/08/2016.
 *
 * BIPARTITE GRAPH CHECK :
 *  _ Simple check
 *
 */
public class BipartiteGraphCheck_Bicoloring {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int N,E,A,B;

        while( (N=S.nextInt())!=0 ){

            E=S.nextInt();

            ArrayList<ArrayList<Integer>> L =  new ArrayList();

            for( int n=0; n<N ; n++ ){
                L.add(new ArrayList<>());
            }

            for( int e=0; e<E ; e++ ){
                A = S.nextInt();
                B = S.nextInt();
                L.get(A).add(B);
                L.get(B).add(A);
            }

            int [] T = new int [N];

            LinkedList LL = new LinkedList<Integer>();
            LL.add(0);
            T[0]=1;

            boolean ok = true;

            all:
            while(!LL.isEmpty()){
                int Node = (int)LL.pop();
                for ( Integer I : L.get(Node) ){
                    if ( T[I] == 0 ){
                        T[I]=T[Node]*-1;
                        LL.add(I);
                    }
                    if( T[I] == T[Node] ){
                        ok = false;
                        break all;
                    }
                }

            }

            if(ok)
                System.out.println("BICOLORABLE.");
            else
                System.out.println("NOT BICOLORABLE.");

        }

    }

}
