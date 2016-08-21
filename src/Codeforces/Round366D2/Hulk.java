package Codeforces.Round366D2;

import java.util.Scanner;

public class Hulk {

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        int T = S.nextInt();

        String Res = "I hate ";

        for ( int i = 1 ; i < T ; i++ ){

            if ( i % 2 == 0 ) {
                Res += "that I hate ";
            } else {
                Res += "that I love ";
            }

        }

        Res += "it";

        System.out.println(Res);

    }

}
