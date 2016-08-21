package Nabeul_Camp.A2OJ_Contest;

import java.util.*;

/**
 * Created by adam- on 20/07/2016.
 *
 * Modified BFS goes TLE
 * DIJKSTRA goes ACC
 *
 */
public class Sending_Email {

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        int N,W,D,A,T = S.nextInt();

        for ( int t = 1 ; t <= T ; t++ ){


            ArrayList<ArrayList<Integer>> L = new ArrayList<ArrayList<Integer>>();

            N=S.nextInt();
            W=S.nextInt();
            D=S.nextInt();
            A=S.nextInt();

            HashMap<String, Integer> HM = new HashMap<String,Integer>();

            long [] Visited = new long [N];

            for ( int n = 0 ; n < N ; n ++ ){
                L.add(new ArrayList<Integer>());
            }

            for ( int w = 0 ; w < W ; w ++ ){

                int a = S.nextInt();
                int b = S.nextInt();
                int c = S.nextInt();

                L.get(a).add(b);
                L.get(b).add(a);
                HM.put(a+" "+b,c);
                HM.put(b+" "+a,c);

            }

            Queue<Integer> Q = new LinkedList<Integer>();

            Q.add(D);
            Visited[D]=1;

            while(!Q.isEmpty()){

                int Current = Q.remove();

                for (int n : L.get(Current) ){

                    if( Visited[n] == 0 || ( Visited[n] > Visited[Current] + HM.get(Current+" "+n) )){
                        Q.add(n);
                        Visited[n] = Visited[Current] + HM.get(Current+" "+n);
                    }

                }

            }

            System.out.print("Case #"+t+": ");
            if ( Visited[A] == 0  )
                System.out.println("unreachable");
            else
                System.out.println(Visited[A] - 1);

        }

    }

}
