package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.Scanner;

/** DONE
 * Created by adam- on 03/08/2016.
 *
 *  1D ARRAY MANIPULATION:
 *      _ Read the statement better.
 *
 */
public class D1ArrayManipulation_Jolly_Jumpers {

    static int N;

    public static void main (String [] args){

        Scanner S = new Scanner(System.in);

        while( S.hasNext() ){

            N = S.nextInt();

            int [] T = new int [N];
            T[0]=S.nextInt();

            int [] V = new int [N];


            for ( int n = 1 ; n < N ; n++ ){

                T[n] = S.nextInt();

                if( Math.abs(T[n]-T[n-1]) >= 0 && Math.abs(T[n]-T[n-1]) < N )
                    V[Math.abs(T[n]-T[n-1])]=1;

            }


            boolean j = true;
            for (int n = 1 ; n < N ;n++)
                if( V[n]==0)
                    j=false;

            if(j)
                System.out.println("Jolly");
            else
                System.out.println("Not jolly");

        }

    }

}
