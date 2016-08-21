package Nabeul_Camp;

import java.util.Scanner;

/**
 * Created by adam- on 21/07/2016.
 */
public class Knapsack {

    static int [] W ;
    static int [] V ;
    static int N,M;

    static int solve(int i, int rem){
       // if( rem < 0)
       //     return Integer.MIN_VALUE;
        if ( i >= N )
            return 0;
        int ch1 = solve(i+1,rem);
        int ch2 = W[i] + solve(i+1,rem-W[i]);
        return Math.max(ch1,ch2);
    }

    public static void main ( String []args){

        Scanner S = new Scanner(System.in);

        N=S.nextInt();
        M=S.nextInt();

        W = new int [N];
        V = new int [N];

        for (int n = 0 ; n < N ; n ++ ){
            W[n] = S.nextInt();
            V[n] = S.nextInt();
        }

        System.out.println(solve(0,M));

    }

}
