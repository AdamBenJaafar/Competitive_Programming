package UVA.Introduction;

import java.util.Scanner;

/**
 * Created by adam- on 27/06/2016.
 */
public class Mother_Bear {

    public static boolean isValid(char c){


        if( c =='.' || c ==',' || c =='!' || c =='?' || c ==' ')
            return true;
        return false;

    }

    public static void main( String [] args){

        Scanner S = new Scanner(System.in);

        String X;

        while( !( X = S.next() ).equals("DONE") ){

            int i=0;
            int j=X.length()-1;

            int ok =1;
            while( i < j ){

                if ( isValid(X.charAt(i)) && isValid(X.charAt(j)) ){
                    if ( X.charAt(i) == X.charAt(j) ){
                        i++;
                        j--;
                    }else{
                        i=j;
                        System.out.println("Uh oh..");
                        ok = 0;
                    }
                }else if ( !isValid(X.charAt(i)) && !isValid(X.charAt(j)) ) {
                    i++;
                    j--;
                }else if ( !isValid(X.charAt(j)) ) {
                    j--;
                }else if ( !isValid(X.charAt(i)) ) {
                    i++;
                }
            }

            if( ok == 1)
              System.out.println("You won’t be eaten!");
        }

    }

}
