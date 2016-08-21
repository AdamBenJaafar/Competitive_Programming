package UVA.Introduction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adam- on 09/06/2016.
 *
 * AD-HOC CALCULATIONS
 *
 */
public class Loansome_Car_Buyer {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int D,M ;
        double Loan,Down;

        while (  ( M = S.nextInt() ) > 0 ) {

            int R = 1 ;

            Down = S.nextDouble();
            Loan = S.nextDouble();
            D = S.nextInt();

            double Worth = Loan ;



            System.out.println("Down = "+ Down);
            System.out.println("Loan = "+ Loan);
            System.out.println("Worth = "+ Worth);

            ArrayList<Integer> A = new ArrayList();
            ArrayList<Double> B = new ArrayList();

            for ( int d = 0 ; d < D ; d++ ){

                int x = S.nextInt();
                double y = S.nextDouble();

                A.add(x);
                B.add(y);

            }

            System.out.println(A.toString());
            System.out.println(B.toString());




            int dep = 0 ;

            Loan-=Down ;
            Worth -= Worth * B.get(dep);

            System.out.println( R+" month : laon = " +Loan + " worth = " + Worth );

            while( Worth > Loan){



                R++;
                Loan -= Down;
                Worth -= Worth * B.get(dep);

                if( dep != D-1 )
                    if( A.get(dep+1) == R )
                        dep++;

                System.out.println( R+" month : laon = " +Loan + " worth = " + Worth );

            }

            if ( R == 1 )
                System.out.println("1 month");
            else
                System.out.println(R+" months");


        }

    }

}
