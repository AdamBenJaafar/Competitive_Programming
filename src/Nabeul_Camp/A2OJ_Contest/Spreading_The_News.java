package Nabeul_Camp.A2OJ_Contest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by adam- on 20/07/2016.
 *
 * Unweighted Graph - EASY BFS
 *
 */
public class Spreading_The_News {

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

        int E = S.nextInt();

        for( int e = 0 ; e < E ; e++ ){

            A.add(new ArrayList<Integer>());

        }

        for( int e = 0 ; e < E ; e++ ){

            int F = S.nextInt();

            for ( int f = 0 ; f < F ; f++ ){

                int x = S.nextInt();

                A.get(e).add(x);

            }

        }


        int C = S.nextInt();

        for ( int c = 0 ; c < C ; c++ ){



            int maxb=0;
            int dayb=0;
                    int Source= S.nextInt();

            int [] Visited = new int [E];

            Queue<Integer> Q = new LinkedList<Integer>();

            Q.add(Source);
            Visited[Source] = 1;

            int [] Heard = new int [E];

            while ( ! Q.isEmpty() ){

               // System.out.println(Q);

                int Current = Q.remove();

                for (int n : A.get(Current)){

                    if ( Visited[n] == 0 ){

                        Visited[n] = Visited[Current]+1;
                        Q.add(n);

                        Heard[Visited[n]]++; // go arraylist


                        if( Heard[Visited[n]] > maxb) {
                            maxb = Heard[Visited[n]];
                            dayb = Visited[n];
                        }

                    }


                }

            }

//            for ( int i =0 ; i < E ; i++ ){
//                if ( Heard[i] > maxb ){
//                    maxb = Heard[i];
//                    dayb = i;
//                }
//            }


            if(maxb != 0)
                System.out.println(maxb+" "+(dayb-1));
            else
                System.out.println(0);

        }

    }

}
