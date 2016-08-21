package UVA.Problem_Solving_Paradigms;

import java.util.Scanner;

/**
 * Created by adam- on 23/06/2016.
 */
public class The_Jackpot {

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        int N;

        while (( N = S.nextInt() ) != 0 ){

            int MaxStreak = -1 ;
            int Streak = 0 ;

            for ( int n = 0 ; n < N ; n++ ){

                int X = S .nextInt();

                if( X > 0 ){
                    Streak+=X;
                    if ( Streak > MaxStreak )
                        MaxStreak = Streak;
                }else{
                    Streak+=X;
                    if ( Streak < 0 )
                        Streak = 0 ;
                    if ( Streak > MaxStreak && Streak != 0 )
                        MaxStreak = Streak;
                }

            }



            if( MaxStreak != -1 )
                System.out.println("The maximum winning streak is "+MaxStreak+".");
            else
                System.out.println("Losing streak.");

        }

    }

}
