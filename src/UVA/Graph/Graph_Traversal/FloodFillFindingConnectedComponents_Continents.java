package UVA.Graph.Graph_Traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** DONE
 * Created by adam- on 02/08/2016.
 *
 * FLOOD FILL / FINDING CONNECTED COMPONENTS:
 *  _ Input & Test Case example attention !!
 *  _ BFS on identified land
 *
 */
public class FloodFillFindingConnectedComponents_Continents {

    static int X,Y,x,y,Res;

    static int [] dx = { 1 , 0 , 0 , -1};
    static int [] dy = { 0 , 1 , -1 , 0};

    public static boolean inBorders(int x, int y){
        if ( x < 0 || x == X)
            return false;
        return true;
    }

    public static void main ( String [] args){

        Scanner S = new Scanner(System.in);

        while( S.hasNext() ){

            Res = 0 ;

            char it ;

            X=S.nextInt();
            Y=S.nextInt();

            String [] M = new String[X];

            for ( int x = 0 ; x < X ; x ++ ){
                M[x]=S.next();
            }

            x=S.nextInt();
            y=S.nextInt();

            it = M[x].charAt(y);

            int [][] V = new int [X][Y];

            Queue<Integer> Q = new LinkedList<Integer>();

            Q.add(x);
            Q.add(y);
            V[x][y] = 1;

            while( !Q.isEmpty() ){

                int CX = Q.remove();
                int CY = Q.remove();

                for ( int i = 0 ; i < 4 ; i++ ){

                    int nx = CX+dx[i];
                    int ny = (CY+dy[i])%Y;

                    if(ny<0)
                        ny+=Y;

                    if( inBorders(nx,ny) && ( V[nx][ny] == 0 ) && ( M[nx].charAt(ny) == it ) ){
                        Q.add(nx);
                        Q.add(ny);
                        V[nx][ny]=1;
                    }

                }

            }

            for ( int x = 0 ; x < X ; x++ ){

                if(M[x].contains(it+"")){

                    for ( int y = M[x].indexOf(it+"") ; y < Y ; y++){

                        if( M[x].charAt(y) == it && ( V[x][y] == 0 ) ){

                            int Size = 1;

                            Q = new LinkedList<Integer>();

                            Q.add(x);
                            Q.add(y);
                            V[x][y] = 1;

                            while( !Q.isEmpty() ){

                                int CX = Q.remove();
                                int CY = Q.remove();

                                for ( int i = 0 ; i < 4 ; i++ ){

                                    int nx = CX+dx[i];
                                    int ny = (CY+dy[i])%Y;

                                    if( ny < 0)
                                        ny += Y ;

                                    if( inBorders(nx,ny) && ( V[nx][ny] == 0 ) && ( M[nx].charAt(ny) == it) ){
                                        Q.add(nx);
                                        Q.add(ny);
                                        V[nx][ny]=1;
                                        Size++;
                                    }

                                }

                            }

                            if(Size > Res)
                                Res = Size;

                        }

                    }

                }

            }

            System.out.println(Res);

        }

    }

}
