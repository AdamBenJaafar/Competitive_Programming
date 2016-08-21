package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by adam- on 20/08/2016.
 */
public class JavaCollections_Contest_Scoreboard {

    public static int T;
    public static int C;
    public static String X;

    public static class problemSet {

        public int T ;
        public BitSet Solved;
        public int [] E;
        public int Score;

        public problemSet(int T){
            this.T = T;
            this.Solved = new BitSet(9);
            this.E = new int [9];
        }

        public void correct(int b, int e){
            if ( !Solved.get(b-1) ) {
                E+=e;
                Solved.set(b-1);
            }
        }

        public void incorrect(int b, int e){
            if ( !Solved.get(b-1) ) {
                E+=20;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            problemSet that = (problemSet) o;

            return E == that.E;

        }
    }

    public static void main ( String [] args ) {

        Scanner S = new Scanner(System.in);

        C=S.nextInt();

        for ( int c = 0 ; c < C ; c++ ){

            HashMap<Integer, problemSet> HM = new HashMap<Integer, problemSet>();

            S.nextLine();
            while( !( X = S.nextLine()).equals("") )  {

                Scanner SS = new Scanner(X);

                int a = SS.nextInt();
                int b = SS.nextInt();
                int e = SS.nextInt();
                String d = SS.next();

                if ( !HM.containsKey(a) ) {
                    HM.put(a,new problemSet(a));
                }

                if ( d.equals("C") ) {

                    HM.get(a).correct(b,e);

                } else if ( d.equals("I")) {

                    HM.get(a).incorrect(b,e);

                }

                ArrayList<problemSet> A = new ArrayList<problemSet>(HM.values());
                A.sort(null);

                for ( problemSet PS : A) {
                    System.out.println(PS.T+" "+PS.Solved.cardinality()+" "+PS.E);
                }

            }

        }

    }

}
