package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.ArrayList;
import java.util.Scanner;

/** ACCEPTED (3) - Simple ArrayList Problem.
 *      (1,2) - Simple presentation error.
 *
 *      _ Used LONG for extreme cases.
 */
public class JavaCollections_What_Is_The_Median {

    static ArrayList<Long> A = new ArrayList<Long>();
    static int size = 0;
    static long R = 0;

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        while ( S.hasNext() ){
            A.add(S.nextLong());
            A.sort(null);

            size++;

            if( (size % 2) == 0) {
                R = A.get(size/2) + A.get((size-1)/2);
                R /= 2;
                System.out.println(R);
            } else {
                System.out.println(A.get(size/2));
            }

        }



    }

}
