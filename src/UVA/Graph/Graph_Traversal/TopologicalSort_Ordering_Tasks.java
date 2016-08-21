package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by adam- on 01/08/2016.
 *
 * TOPOLOGICAL SORT :
 *      _ Check next nodes to add current ones
 *      _ BFS from ending nodes
 *
 */
public class TopologicalSort_Ordering_Tasks {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int M,N,A,B;

        while( (N=S.nextInt())!=0 ){

            M=S.nextInt();

            ArrayList<ArrayList<Integer>> LB =  new ArrayList();
            ArrayList<ArrayList<Integer>> LN =  new ArrayList();

            for( int n = 0 ; n <= N ; n++ ){
                LB.add(new ArrayList<Integer>());
                LN.add(new ArrayList<Integer>());
            }

            for( int m = 0 ; m < M ; m++ ){
                A = S.nextInt();
                B = S.nextInt();
                LB.get(A).add(B);
                LN.get(B).add(A);
            }

            ArrayList<Integer> F = new ArrayList<Integer>();

            for( int n = 1 ; n <= N ; n++ ){
                if(LB.get(n).size() == 0 ){
                    F.add(n);
                }
            }

            int [] T = new int [N+1];

            Queue<Integer> Q = new LinkedList<Integer>();

            String Res="";

            for ( int f : F){
                Q.add(f);
                T[f]=1;
                Res += f +" ";
            }

          //  System.out.println(F);
          //  System.out.println(Res);

            while (!Q.isEmpty()){

                int C = Q.remove();

                for ( int n : LN.get(C) ){

                    if ( T[n] == 0 ){

                        boolean ok = true;
                        for ( int x : LB.get(n))
                            if (T[x] == 0 )
                                ok=false;


                        if( ok) {
                            Q.add(n);
                            T[n] = 1;
                            Res = n + " " + Res;
                        }
                    }

                }

            }

            System.out.println(Res.substring(0,Res.length()-1));

        }

    }

}
