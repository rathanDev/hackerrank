package jana;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Duplication1 {



    static String duplication(int x){
        // Complete this function
        int index = x;


        String binaryString = Integer.toBinaryString(index);
        System.out.println("binaryString = " + binaryString);
        int length = binaryString.length();
        System.out.println("length = " + length);

        String xInitial = "0";

        StringBuilder s = new StringBuilder();

        s.append(xInitial);
        for (int i = 0; i <= length; i++) {

            StringBuilder t = new StringBuilder();
            for (char ch : s.toString().toCharArray()) {
                t.append(ch == '0' ? '1' : '0');
            }
            s.append(t.toString());
        }

        System.out.println("x.toString() = " + s.toString());

//        String x = "1001";


        index = 2;
        char c = s.charAt(index);
        System.out.println("c = " + c);

        index = 5;
        c = s.charAt(index);
        System.out.println("c = " + c);

        index = 7;
        c = s.charAt(index);
        System.out.println("c = " + c);

        return String.valueOf(s.charAt(index));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        //input     times   max
//        //1     ->  1       2
//        //2         1       2
//        //
//
//        int input = 10;
//
//

//    }


}
