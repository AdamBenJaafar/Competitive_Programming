package UVA.Graph.Graph_Traversal;

import java.util.*;

/** DONE
 * Created by adam- on 02/08/2016.
 *
 * JUST GRAPH TRAVERSAL:
 *  _ Tricky cases ith N or M == 0  or N==M because the same spot can be aime twice uDebugged :(
 *
 */
public class JustGraphTraversal_Knight_In_A_War_Grid {

    static int T,R,C,M,N,W,a,b,cx,cy,nx,ny,jump;

    public static boolean inBorders(int x, int y){
        if( x < 0 || y < 0 || x >= R || y >= C )
            return false;
        return true;
    }

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        T = S.nextInt();

        for ( int t = 1 ; t <= T ; t++ ){

            int ODD=0;
            int EVEN=0;

            R=S.nextInt();
            C=S.nextInt();
            M=S.nextInt();
            N=S.nextInt();

            int [] dx = { M , M , N , N ,-M ,-M ,-N ,-N};
            int [] dy = { N ,-N , M ,-M , N ,-N , M ,-M};

            int [][] V = new int [R][C];

            int W = S.nextInt();

            for ( int w = 0 ; w < W ; w++ ){
                V[S.nextInt()][S.nextInt()] = -1;
            }

            Queue<Integer> Q=  new LinkedList<Integer>();

            Q.add(0);
            Q.add(0);
            V[0][0] = 1 ;

            while ( ! Q.isEmpty() ){

                jump = 0;

                cx=Q.remove();
                cy=Q.remove();

                for ( int i = 0 ; i < 8 ; i++) {

                    nx = cx + dx[i];
                    ny = cy + dy[i];

                    if( inBorders(nx,ny)) {
                            if (V[nx][ny] == 0) {
                                Q.add(nx);
                                Q.add(ny);
                                V[nx][ny]++;
                                jump++;
                            }else if (V[nx][ny] == 1) {
                                jump++;
                            }
                    }

                }

                if( (N * M == 0) || (N==M))
                    jump = jump / 2;

                if (jump % 2 == 0)
                    EVEN++;
                else
                    ODD++;
            }

            System.out.println("Case "+t+": "+EVEN+" "+ODD);

        }



    }

}
