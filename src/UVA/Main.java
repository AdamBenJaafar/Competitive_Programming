package UVA;
import java.util.Scanner;

public class Main {

    public static String reverse(String X){
        String R="";
        for (int i = 0; i < X.length(); i++){
            R = X.charAt(i) + R;
        }
        return R;
    }

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        while(S.hasNext()){

            String X = S.nextLine();


            Scanner SX = new Scanner(X);

            String R ="";

            while(SX.hasNext()){
                R+=reverse(SX.next())+" ";
            }

            R=R.substring(0,R.length()-1);

            System.out.println(R);
        }

    }

}