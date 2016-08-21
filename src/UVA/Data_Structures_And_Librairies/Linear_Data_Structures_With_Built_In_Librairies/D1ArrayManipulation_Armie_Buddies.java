//package UVA.Data_Structures_And_Librairies.Linear_Data_Structures_With_Built_In_Librairies;
//
//import java.util.Scanner;
//
///**
// * Created by adam- on 04/08/2016.
// */
//public class D1ArrayManipulation_Armie_Buddies {
//
//    static int A,B,a,b;
//    static int [] T ;
//
//    public static void main( String []args){
//
//        Scanner S = new Scanner(System.in);
//
//        while( ( A =S.nextInt() ) != 0 ){
//
//            B=S.nextInt();
//
//            T = new int [A+1];
//            int LL=0,RR=A;
//
//
//            for ( int d = 0 ; d < B ; d++ ){
//
//                a = S.nextInt();
//                b = S.nextInt();
//
//                for ( int i = a ; i <= b ; i++){
//                    T[i] = 1;
//                }
//
//                String L="*";
//                String R="*";
//
//                do{
//                    a--;
//                }while( a >= 0 && T[a] == 1 );
//
//                if( a > 0)
//                    L=""+a;
//
//                do{
//                    b++;
//                }while(  b<(A+1) && T[b] == 1 );
//
//                if ( b < A+1)
//                    R=""+b;
//
//                System.out.println(L+" "+R);
//
//                if(LL=)
//
//            }
//
//            System.out.println("-");
//
//        }
//
//    }
//
//}
