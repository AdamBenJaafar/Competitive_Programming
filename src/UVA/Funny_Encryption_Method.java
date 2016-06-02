package UVA;

import java.util.Scanner;

public class Funny_Encryption_Method{

    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }


    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        S.next();

        while(S.hasNext()){
            int X = S.nextInt();

            String A = Integer.toBinaryString(X);
            int A1 = 0;
            for ( char x : A.toCharArray() ){
                if ( x == '1') A1++;
            }


            int XX=hex2decimal(X+"");

            String B = Integer.toBinaryString(XX);
            int B1 = 0;
            for ( char x : B.toCharArray() ){
                if ( x == '1') B1++;
            }


            System.out.println(A1+" "+B1);

        }

    }

}