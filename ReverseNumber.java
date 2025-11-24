import java.util.*;
import java.lang.*;
import java.io.*;

class  ReverseNumber{
    public static int decimalToOctal(int num) {
        if (num == 0) {
            return 0;
        }

        int rev = 0;
        while (num > 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();

        System.out.println(decimalToOctal(decimal));
    }
}
