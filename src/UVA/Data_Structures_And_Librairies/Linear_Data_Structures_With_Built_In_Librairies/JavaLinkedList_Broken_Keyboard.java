package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by adam- on 03/08/2016.
 */
public class JavaLinkedList_Broken_Keyboard {

    static String X;

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        while( S.hasNext() ){

            X=S.nextLine();

            String x="";
            String Res="";

            int pos = 0;


            int min = 0 ;

            while(( !(X.indexOf("]",pos) == -1 ) || !(X.indexOf("[",pos) == -1 )) && (min < X.length()-1 )){

                min = Math.min(X.indexOf("]",pos),X.indexOf("[",pos));

                System.out.println(" We have someone at " + min);

                x = X.substring(pos,min);

                System.out.println(" Someone left behind: "+x);

                if(X.charAt(min)==']'){
                    Res = x  + Res;
                }else{
                    Res = Res + x;
                }

                pos=min+1;

            }

            Res = Res + x;


            System.out.println(Res);

        }

    }

}
