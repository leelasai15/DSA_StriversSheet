import java.util.*;
class CheckPalindrome{

    static void isPalindrome(String str){

        if(str.length() < 1){
            System.out.println("Palindrome");
        }
        int i = 0, j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("Not Palindrome");
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args){
        String str = "ababababa";
        isPalindrome(str);
    }
}