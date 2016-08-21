package UVA.Introduction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by adam- on 09/06/2016.$
 *
 * USING SORT METHOD BY OVERRIDING COMPARE FUNCTION
 *
 */
public class Cost_Cutting {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int C = S.nextInt();

        for ( int c = 0 ; c < C ; c++ ){

            ArrayList<Integer> A = new ArrayList<>();

            Integer X = new Integer(S.nextInt());
            Integer Y = new Integer(S.nextInt());
            Integer Z = new Integer(S.nextInt());

            A.add(X);
            A.add(Y);
            A.add(Z);

            // Using sort method by Overriding compare function
            A.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if ( o1.intValue() > o2.intValue() ) return 1;
                    return -1;
                }
            });

            // Traditional way
            // Collections.sort(A);

            System.out.println("Case "+(c+1)+": "+A.get(1));

        }

    }

}
