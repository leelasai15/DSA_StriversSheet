import java.util.*;
public class CountDigits {
    static int countDigits(int num) {

        if(num == 0){
            return 0;
        }
        String str = Integer.toString(num);

//        while(num > 0){
//            num = num/10;
//            count++;
//        }
        return str.length()+1;
    }
    public static void main(String[] args){
        int num = 2342424;
        System.out.println(countDigits(num));
    }
}
