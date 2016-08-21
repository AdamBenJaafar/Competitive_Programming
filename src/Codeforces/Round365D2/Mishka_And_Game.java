package Codeforces.Round365D2;

import java.util.Scanner;

/**
 * Created by adam- on 04/08/2016.
 */
public class Mishka_And_Game {

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        int C = S.nextInt();

        int R = 0;

        for ( int c = 0 ; c < C ; c++ ){

            int a = S.nextInt();
            int b = S.nextInt();

            if( a > b){
                R++;
            }else if ( b > a ){
                R--;
            }

        }

        if( R == 0)
            System.out.println("Friendship is magic!^^");
        else if ( R < 0)
            System.out.println("Chris");
        else
            System.out.println("Mishka");

    }

}
