package UVA.Graph.Graph_Traversal;

import java.util.Scanner;

/** DONE
 * Created by adam- on 02/08/2016.
 *
 * JUST GRAPH TRAVERSAL:
 *  _ Mass of controls
 *  _ Simple
 *
 */
public class JustGraphTraversal_Sticker_Collector_Robot {

    static int N,M,O,X,Y,Dir;
    static String Moves;

    static int [] dx = { -1 , 0 , 1 , 0};
    static int [] dy = { 0 , -1 , 0 , 1};

    static String [] T;

    public static boolean isAdvancing(int x, int y){
        if ( x < 0 || y < 0 || x == N ||y == M || ( T[x].charAt(y) == '#'))
            return false;
        return true;
    }

    public static void main ( String [] args) {

        Scanner S = new Scanner(System.in);

        while( ( N = S.nextInt() ) != 0){

            int Res = 0;

            M=S.nextInt();
            O=S.nextInt();

            T = new String [N];

            int [][] V = new int [N][M];

            for ( int  n = 0 ; n < N ; n++ ){

                T[n]=S.next();
                if ( T[n].contains("N") || T[n].contains("S") || T[n].contains("L") || T[n].contains("O")) {
                    X=n;
                    if( T[n].indexOf("N")!= -1 ){
                        Y=T[n].indexOf("N");
                        Dir=0;
                    }
                    if( T[n].indexOf("O")!= -1 ){
                        Y=T[n].indexOf("O");
                        Dir=1;
                    }
                    if( T[n].indexOf("S")!= -1 ){
                        Y=T[n].indexOf("S");
                        Dir=2;
                    }
                    if( T[n].indexOf("L")!= -1 ){
                        Y=T[n].indexOf("L");
                        Dir=3;
                    }

                }

            }

            Moves=S.next();

            for ( char c : Moves.toCharArray()){

                if( c == 'D') {
                    Dir--;
                    if (Dir < 0)
                        Dir = 3;
                } else if( c == 'E'){
                    Dir++;
                    if ( Dir == 4)
                        Dir =0;
                }else{
                    if( isAdvancing(X+dx[Dir],Y+dy[Dir]) ){

                        X+=dx[Dir];
                        Y+=dy[Dir];

                        if( ( T[X].charAt(Y)=='*' ) && V[X][Y]==0){
                            Res++;
                            V[X][Y]=1;
                        }


                    }
                }



            }

            System.out.println(Res);
        }

    }

}
