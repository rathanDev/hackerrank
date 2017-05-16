package jana;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Duplication1 {

    static String duplication(int x){
        // Complete this function
        return "";
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

}
