package UVA.Problem_Solving_Paradigms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by adam- on 23/06/2016.
 */

// 1 Wrong Answer because of round difference : 1.0 & 1.00

public class Tour_De_France {

    public static void main (String[] args) {

        Scanner S = new Scanner(System.in);

        int F,R;

        while ( ( F = S.nextInt() ) != 0 ){

            R = S.nextInt();

            ArrayList<Integer> FL = new ArrayList();

            for ( int f = 0 ; f < F ; f++ ){
                FL.add(S.nextInt());
            }

            ArrayList<Integer> RL = new ArrayList();

            for ( int r = 0 ; r < R ; r++ ){
                RL.add(S.nextInt());
            }

            ArrayList<Double> Ratios = new ArrayList();

            for ( int f = 0 ; f < F ; f++ ){
                for ( int r = 0 ; r < R ; r++ ){
                    Ratios.add( (double)RL.get(r) / (double)FL.get(f) );
                }
            }

            Collections.sort(Ratios);

            double max = -1;
            for ( int i = 1 ; i < Ratios.size() ; i++ ){
                double X = Ratios.get(i) / Ratios.get(i-1);
                if ( X > max )
                    max = X ;
            }

            double Res = (double)(Math.round( max * 100 )) / 100.0;

            System.out.printf(  String.format("%.2f\n", Res));


        }

    }

}
