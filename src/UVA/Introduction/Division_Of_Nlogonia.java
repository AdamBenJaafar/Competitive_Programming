package UVA.Introduction;

import java.util.Scanner;

/**
 * Created by adam- on 04/07/2016.
 *
 * COMPARING
 *
 */
public class Division_Of_Nlogonia {

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        int Q;

        while ( ( Q = S.nextInt() ) != 0 ){

            int X = S.nextInt();
            int Y = S.nextInt();

            for ( int q = 0 ; q < Q ; q++ ){

                int x = S.nextInt();
                int y = S.nextInt();

                if ( x == X || y == Y){
                    System.out.println("divisa");
                }
                if ( x > X ){
                    if ( y < Y){
                        System.out.println("SE");
                    }
                    if ( y > Y){
                        System.out.println("NE");
                    }
                }
                if ( x < X ){
                    if ( y < Y){
                        System.out.println("SO");
                    }
                    if ( y > Y){
                        System.out.println("NO");
                    }
                }

            }

        }


    }

}
