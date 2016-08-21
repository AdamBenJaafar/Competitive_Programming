package UVA.Problem_Solving_Paradigms.Complete_Search;

import java.util.Scanner;

/** DONE
 * Created by adam- on 03/08/2016.
 *
 * ITERATIVE ( ONE LOOP, LINEAR SCAN ):
 *  _ Read output
 *
 */
public class IterativeOneLoopLinearScan_Expert_Enough {

    static int C,V,Q,prix;

    public static void main ( String [] args ){

        Scanner S = new Scanner(System.in);

        C = S.nextInt();

        for ( int  c = 0 ; c < C ; c++ ){

            if(c!=0)
                System.out.println();

            int V = S.nextInt();

            int [][] Cout = new int [V][2];
            String [] Nom = new String [V];

            for ( int v = 0 ; v < V ; v++ ){

                Nom[v]=S.next();
                Cout[v][0]=S.nextInt();
                Cout[v][1]=S.nextInt();

            }

            int Q = S.nextInt();

            for ( int q = 0 ; q < Q ; q++ ){

                prix = S.nextInt();

                String Res="UNDETERMINED";

                for ( int v = 0 ; v < V ; v++ ){

                    if ( prix >= Cout[v][0] && prix <= Cout[v][1] ){
                        if(Res.equals("UNDETERMINED"))
                            Res=Nom[v];
                        else{
                            v=V; Res="UNDETERMINED";
                        }
                    }
                }

                System.out.println(Res);

            }

        }


    }

}
