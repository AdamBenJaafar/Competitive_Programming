package Codeforces.Round366D2;

import java.util.Scanner;

/**
 * Created by adam- on 07/08/2016.
 */
public class Sprider_Man {

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        int T = S.nextInt();

        int supC = 0;

        for (int t = 0 ; t < T ; t++ ){

            int a = S.nextInt();

            supC += a -1 ;

            if ( supC % 2 == 0)
                System.out.println(2);
            else
                System.out.println(1);

        }

    }

}
