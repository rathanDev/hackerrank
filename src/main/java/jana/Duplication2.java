/**
 * Challenge urself
 */
package jana;

import java.util.Scanner;


public class Duplication2 {

    public static void main(String[] args) {
        System.out.println("Enter q");
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            System.out.println("Enter x");
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }

    static String duplication(int x){
        System.out.println("x = " + x);

        String binaryString = Integer.toBinaryString(x);
        System.out.println("binaryString = " + binaryString);
        int length = binaryString.length();
        System.out.println("length = " + length);

        String xInitial = "0";

        StringBuilder s = new StringBuilder();

        s.append(xInitial);
        for (int i = 0; i <= length-1; i++) {

            StringBuilder t = new StringBuilder();
            for (char ch : s.toString().toCharArray()) {
                t.append(ch == '0' ? '1' : '0');
            }
            s.append(t.toString());
        }

        System.out.println("x.toString() = " + s.toString());

        String str = String.valueOf(s.charAt(x));
        System.out.println("str = " + str);
        return str;
    }

}
