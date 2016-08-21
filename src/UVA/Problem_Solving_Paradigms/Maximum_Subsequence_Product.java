package UVA.Problem_Solving_Paradigms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adam- on 23/06/2016.
 */
public class Maximum_Subsequence_Product {

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        while(S.hasNext()){

            ArrayList<Long> A = new ArrayList<>();
            long X;

            long max = S.nextLong() ;
            A.add(max);

            while( ( X = S.nextLong() ) != -999999 ){
                A.add(X);
                if( X > max)
                    max = X;
            }

            long Res = max;

            for ( int i = 0 ; i < A.size() ; i++ ){
                long Sum = A.get(i);
                for ( int j = i+1 ; j < A.size() ; j++ ){
                    Sum*=A.get(j);
                    if ( Sum > Res)
                        Res = Sum;
                }
            }

            System.out.println(Res);

        }

    }

}
