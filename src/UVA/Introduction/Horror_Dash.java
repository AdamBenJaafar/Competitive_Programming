package UVA.Introduction;

import java.util.Scanner;

/**
 * Created by adam- on 04/07/2016.
 */
public class Horror_Dash {

    public static void main( String [] args){

        Scanner S= new Scanner(System.in);

        int C = S.nextInt();

        for ( int c = 1 ; c <= C ; c++ ){


            int X = S.nextInt();

            int max = S.nextInt();

            for ( int x = 1 ; x < X ; x++ ){

                int a = S.nextInt();

                if ( a > max )
                    max = a;

            }

            System.out.println("Case "+c+": "+max);

        }

    }

}
