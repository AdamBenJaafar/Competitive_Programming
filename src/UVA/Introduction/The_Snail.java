package UVA.Introduction;

import java.util.Scanner;

/**
 * Created by adam- on 04/07/2016.
 */
public class The_Snail {

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        double H,U,D,F;

        while ( ( H = S.nextDouble() ) != 0 ){

            int ok = 0 ;

            int Day = 0;
            double Height = 0;
            double Fatigue = 0;

            U = S.nextDouble();
            D = S.nextDouble();
            F = S.nextDouble();

            while( ok == 0 ){

                Day++;

                if ( Fatigue <= 1 )
                    Height += U * ( 1.0 - Fatigue );

                if ( Height <= H ){
                    Height -= D;
                    Fatigue += (double) F / 100.0 ;
                }else{
                    ok = 1;
                }

                if ( Height <= 0)
                    ok = -1;

                System.out.println(" Snail is at "+Height+" and is "+ Fatigue);

            }

            if ( ok == 1)
                System.out.println("success on day "+Day);
            else
                System.out.println("failure on day "+Day);

        }

    }

}
