package UVA.Problem_Solving_Paradigms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by adam- on 23/06/2016.
 */
public class Closest_Sums {

    public static void main (String[] args){

        Scanner S = new Scanner(System.in);

        int N,Q,C=1;

        while( (N=S.nextInt()) != 0 ){

            System.out.println("Case "+C+":");

            ArrayList<Integer> L = new ArrayList();

            for ( int n = 0 ; n < N ; n++ ){
                L.add(S.nextInt());
            }

            ArrayList<Integer> T = new ArrayList();

            for ( int i = 0 ; i < N ; i++ ){
                for ( int j = i+1 ; j < N ; j++ ){
                    T.add( L.get(i) + L.get(j) );
                }
            }

            Collections.sort(T);

            //System.out.println(T.toString());

            Q = S.nextInt();

            for ( int q = 0 ; q < Q ; q++ ){

                int X = S.nextInt();
                int R=0;
                int diff=100000000;

                for ( int t = 0 ; t < T.size() ; t++ ){
                    if ( Math.abs(T.get(t) - X) < diff ){
                        diff = Math.abs(T.get(t) - X);
                        R = T.get(t);
                    }
                }

                System.out.println("Closest sum to "+X+" is "+R+".");

            }


            C++;
        }

    }

}
