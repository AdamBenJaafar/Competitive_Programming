package Nabeul_Camp.SPOJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by adam- on 20/07/2016.
 */
public class A_Bug_s_Life {

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        int T = S.nextInt();

        for (int t = 0 ; t < T ; t++ ){

            ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

            int B=S.nextInt();
            int I=S.nextInt();

            int [] Visited = new int [B];

            for ( int b = 0 ; b < B ; b++ ){
                A.add(new ArrayList<Integer>());
            }

            for ( int i = 0 ; i < I ; i++ ){
                int x = S.nextInt();
                int y = S.nextInt();
                A.get(x-1).add(y-1);
                A.get(y-1).add(x-1);
            }





            boolean ok = true ;


            dodo:
            for ( int b = 0 ; b < B ; b ++ ) {


                if( Visited[b] == 0 ) {

                    Queue<Integer> Q = new LinkedList();

                    Q.add(b);
                    Visited[b] = 1;


                    while (!Q.isEmpty() && ok) {

                        int Current = Q.remove();

                        System.out.println("checking " + Current);

                        for (int N : A.get(Current)) {

                            System.out.println("neigh " + N);

                            if (Visited[N] == Visited[Current]) {
                                ok = false;
                                System.out.println(N + " " + Current + " Brokoe up");
                                break dodo;

                            } else if (Visited[N] == 0) {
                                Q.add(N);
                                Visited[N] = Math.abs(Visited[Current] * -1);
                            }

                        }


                    }
                }
            }


            if (ok)
                System.out.println("mriguel");
            else
                System.out.println("le");

        }

    }

}
