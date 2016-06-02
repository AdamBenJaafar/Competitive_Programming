package UVA;

import java.util.Scanner;

/**
 * Created by Adam on 31/05/2016.
 */
public class Find_The_Telephone {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        while(S.hasNext()){

            String R="";
            String X = S.nextLine();

            for ( char x : X.toCharArray() ){
                if ( x >= 'W')
                    R += "9";
                else if ( x >= 'T')
                    R += "8";
                else if ( x >= 'P')
                    R += "7";
                else if ( x >= 'M')
                    R += "6";
                else if ( x >= 'J')
                    R += "5";
                else if ( x >= 'G')
                    R += "4";
                else if ( x >= 'D')
                    R += "3";
                else if ( x >= 'A')
                    R += "2";
                else
                    R+=x;
            }

            System.out.println(R);

        }

    }

}