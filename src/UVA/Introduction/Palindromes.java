package UVA.Introduction;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by adam- on 24/06/2016.
 */
public class Palindromes {

    static HashMap HM;

    public static boolean isPalindrome( String X ){
        for ( int i = 0 ; i < X.length()/2  ; i++ ){
            if( X.charAt(i) != X.charAt(X.length()-1-i) )
                return false;
        }
        return true;
    }

    public static boolean isMirrored( String X ){
        String Y= "";
        X = X.toUpperCase();
        for ( int i = 0 ; i < X.length() ; i++ ){
            if( HM.containsKey(X.charAt(i)) ) {
                Y = HM.get(X.charAt(i)) + Y;
            }else{
                return false;
            }
        }
        return X.equals(Y);
    }

    public static void main(String [] args){

        Scanner S = new Scanner(System.in);

        HM = new HashMap<Character,Character>();

        HM.put('A','A');
        HM.put('E','3');
        HM.put('H','H');
        HM.put('I','I');
        HM.put('J','L');
        HM.put('L','J');
        HM.put('M','M');
        HM.put('0','0');
        HM.put('S','2');
        HM.put('T','T');
        HM.put('U','U');
        HM.put('V','V');
        HM.put('W','W');
        HM.put('X','X');
        HM.put('Y','Y');
        HM.put('Z','5');
        HM.put('1','1');
        HM.put('2','S');
        HM.put('3','E');
        HM.put('5','Z');
        HM.put('8','8');

        while(S.hasNext()){

            String X = S.next();
            int r = 0 ;

            if(isMirrored(X))
                r+=2;
            if(isPalindrome(X))
                r+=1;

            if( r == 0 )
                System.out.println(X+" -- is not a palindrome.");
            if( r == 1 )
                System.out.println(X+" -- is a regular palindrome.");
            if( r == 2 )
                System.out.println(X+" -- is a mirrored string.");
            if( r == 3 )
                System.out.println(X+" -- is a mirrored palindrome.");

        }

    }

}
