package UVA;

import java.util.Scanner;

/**
 * Created by adam- on 02/06/2016.
 */
public class Relational_Operator {

    public static void main(String[] args){

        Scanner S = new Scanner(System.in);

        int C = S.nextInt();
        int A,B;

        for (int c = 0 ; c < C ; c++ ){

            A=S.nextInt();
            B=S.nextInt();

            if(A<B){
                System.out.println("<");
            }
            if(A>B){
                System.out.println(">");
            }
            if(A==B){
                System.out.println("=");
            }

        }


    }

}
