package UVA.Introduction.Ad_Hoc_Problems;

import java.util.Scanner;

/** DONE
 * Created by adam- on 02/08/2016.
 *
 * GAME ( OTHERS ), EASIER:
 *  _ Output presentation error
 *
 */
public class GameOthersEasier_Minesweeper {

    static int R,C,F,m,nx,ny;
    static String L;

    public static boolean inBorders(int x , int y){
        if( x < 0 || y  < 0 || x ==R || y == C)
            return false;
        return true;
    }

    static int [] dx ={ -1 ,-1,-1,0,1,1,1,0 };
    static int [] dy ={ 1, 0 , -1, -1 ,-1, 0,1 ,1 };

    public static void main (String [] args){

        Scanner S = new Scanner(System.in);
        F=1;
        while( ( R=S.nextInt() ) != 0 ){

            if(F !=1)
                System.out.println();

            C=S.nextInt();

            String [] T = new String[R];

            for ( int r = 0 ; r < R ; r++ ){

                T[r]=S.next();

            }

            System.out.println("Field #"+F+":");


            for ( int r = 0 ; r < R ; r++ ){
                L="";
                for ( int c = 0 ; c < C ; c++ ){
                    if (T[r].charAt(c)!= '*'){
                        m=0;
                        for (int i = 0 ; i < 8 ; i++){
                            nx=r+dx[i];
                            ny=c+dy[i];
                            if ( inBorders(nx,ny) && T[nx].charAt(ny)=='*')
                                m++;
                        }
                        L+=m;
                    }else{
                        L+='*';
                    }
                }
                System.out.println(L);
            }

            F++;
        }

    }

}
