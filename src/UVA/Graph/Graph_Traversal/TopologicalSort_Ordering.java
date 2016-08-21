package UVA.Graph.Graph_Traversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by adam- on 01/08/2016.
 */
public class TopologicalSort_Ordering {

    static int C,N,a,b;
    static String T;

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        C = S.nextInt();

        for ( int c = 0 ; c < C ; c++ ){

            S.nextLine();
            String X = S.nextLine();
            String Y = S.nextLine();

            HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();

            ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

            Scanner SX = new Scanner(X);
            Scanner SY = new Scanner(Y);

            N = 0;
            while(SX.hasNext()){

                T = SX.next();
                HM.put((int)T.charAt(0)-65,N);
                N++;

            }

            while(SY.hasNext()){

                T = SY.next();

                a = HM.get((int)T.charAt(0)-65);
                b = HM.get((int)T.charAt(2)-65);

                if( T.charAt(1)=='>' )
                    A.get(b).add(a);
                else
                    A.get(a).add(b);

            }

            for ( int n = 0 ; n < N ; n++ ){



            }

        }

    }

}
