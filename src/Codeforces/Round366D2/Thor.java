package Codeforces.Round366D2;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by adam- on 07/08/2016.
 */
public class Thor {

    static int a,b;

    public static void main ( String [] args) {

        Scanner S = new Scanner(System.in);

        int A=S.nextInt(),E=S.nextInt();


        int [] T =new int [A];
        ArrayList<BitSet> L = new ArrayList<BitSet>();
        for ( int a = 0 ; a < A ; a++ ){
            L.add(new BitSet(E));
        }

        ArrayList<Integer > AA = new ArrayList<Integer>();

        int R = 0;

        for ( int e = 0 ; e < E ; e++ ){

            a=S.nextInt();
            b=S.nextInt();

            if( a == 1){
                L.get(b-1).set(T[b-1]);
                T[b-1]++;
                R++;
                AA.add(b-1);
            }
            if ( a == 2){
                R-= L.get(b-1).cardinality();
                L.get(b-1).clear();
            }
            if ( a == 3 ){
                int [] TT = new int [A];
                for (int i = 0 ; i < a ; i++ ){
                    if( L.get(AA.get(i)).get(i) ) {
                        //TT
                        R--;
                    }
                }
                L.get(b-1).clear(0,a);
            }

            System.out.println(R);

        }

    }
}
