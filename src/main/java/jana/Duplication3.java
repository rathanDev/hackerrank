/**
 * Challenge urself
 */
package jana;

import java.util.Scanner;

public class Duplication3 {

    public static void main(String[] args) {
        System.out.println("Dup 3");

        System.out.println("Enter q");
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        int biggestIndexEntered = -1;

        String s = null;

        for(int a0 = 0; a0 < q; a0++){

            System.out.println();
            System.out.println("Enter x");
            int x = in.nextInt();

            if (x > biggestIndexEntered) {
                s = generateS(x);
                biggestIndexEntered = x;
            }

            String result = String.valueOf(s.charAt(x));
            System.out.println(result);
        }
    }

    static String generateS(int index) {
        String binaryString = Integer.toBinaryString(index);
        System.out.println("binaryString = " + binaryString);
        int noOfTimesToLoop = binaryString.length();
        System.out.println("noOfTimesToLoop = " + noOfTimesToLoop);

        String xInitial = "0";

        StringBuilder s = new StringBuilder();

        s.append(xInitial);
        for (int i = 1; i <= noOfTimesToLoop; i++) {

            StringBuilder t = new StringBuilder();
            for (char ch : s.toString().toCharArray()) {
                t.append(ch == '0' ? '1' : '0');
            }
            s.append(t.toString());
        }

        System.out.println("x.toString() = " + s.toString());
        return s.toString();
    }

}
