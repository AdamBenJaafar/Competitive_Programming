package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adam- on 18/08/2016.
 */
public class JavaCollectios_ID_Code {

    static  String A ;

    public static boolean isLast(String X){
        for ( int i = 1 ; i < X.length() ; i++ ) {
            if ( X.charAt(i) > X.charAt(i-1) ) {
                return false;
            }
        }
        return true;
    }

    public static String next(String X){
        String Res=X;
        int a=0,b=0;
        ok:
        for ( int j = X.length()-1 ; j >=0 ; j-- )
            for ( int i = j-1 ; i >=0 ; i-- ) {
                if(X.charAt(j)> X.charAt(i)){
                    a=j;
                    b=i;
                    break ok;
                }
            }


        Res = X.substring(0,b) + X.charAt(a) + X.substring(b+1,a) + X.charAt(b) ;
        if( a != X.length()-1 )
            Res += X.substring(a+1,X.length()-1);

        ArrayList <Character> A = new ArrayList<Character >();

        for ( int j = b+1 ; j < Res.length()  ; j++ ) {
            A.add(Res.charAt(j));
        }

        A.sort(null);
        String R = "";
        for ( int j = 0 ; j < A.size() ; j++  ){
            R += A.get(j) ;
        }
        Res = Res.substring(0,b+1) + R ;

        return Res;
    }



    public static void main(String [] args ){

        Scanner S = new Scanner(System.in);

        while ( S.hasNext()){

            if ( !(A = S.next() ).equals("#")) {

                if(!isLast(A)) {
                    System.out.print(next(A));
                } else {
                    System.out.print("No Successor");
                }

            }

        }

    }

}
