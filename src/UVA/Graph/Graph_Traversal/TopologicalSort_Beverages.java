package UVA.Graph.Graph_Traversal;

import java.util.*;

/**
 * Created by adam- on 01/08/2016.
 */
public class TopologicalSort_Beverages {

    static int B,R,C;
    static String a,b;

    public static void main(String [] args){

        Scanner S = new Scanner(System.in);

        C = 0;

        while(S.hasNext()){
            C++;

            B = S.nextInt();

            HashMap<String, Integer> HM = new HashMap<String,Integer>();
            HashMap<Integer, String> HM1 = new HashMap<Integer,String>();

            ArrayList<ArrayList<Integer>> LB =  new ArrayList();
            ArrayList<ArrayList<Integer>> LN =  new ArrayList();

            for ( int b = 0 ; b < B ; b++ ){
                String x= S.next();
                HM.put(x,b);
                HM1.put(b,x);
                LB.add(new ArrayList<Integer>());
                LN.add(new ArrayList<Integer>());
            }

            R = S.nextInt();

            for ( int r = 0 ; r < R ; r++ ){
                a = S.next();
                b = S.next();
                LB.get(HM.get(a)).add(HM.get(b));
                LN.get(HM.get(b)).add(HM.get(a));
            }

            //System.out.println(HM);
            //System.out.println(HM1);

            ArrayList<Integer> F = new ArrayList<Integer>();

            for( int b = 0 ; b < B ; b++ ){
                if(LB.get(b).size() == 0 ){
                    F.add(b);
                }
            }

            int [] T = new int [B];

            Queue<Integer> Q = new LinkedList<Integer>();

            String Res="";

            for ( int f : F){
                Q.add(f);
                T[f]=1;
                Res += f +" ";
            }


            while (!Q.isEmpty()){

                int C = Q.remove();

                for ( int n : LN.get(C) ){

                    if ( T[n] == 0 ){

                        boolean ok = true;
                        for ( int x : LB.get(n))
                            if (T[x] == 0 )
                                ok=false;


                        if( ok) {
                            Q.add(n);
                            T[n] = 1;
                            Res = n + " " + Res;
                        }
                    }

                }

            }

            String RES ="";

            Scanner SS = new Scanner(Res);
            while( SS.hasNext() ){
                RES += HM1.get(Integer.valueOf(SS.next()))+" ";
            }

            System.out.println("Case #"+C+": Dilbert should drink beverages in this order: "+RES.substring(0,RES.length()-1)+".\n");

        }


    }

}
