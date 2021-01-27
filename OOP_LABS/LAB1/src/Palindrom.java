import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){

        String str = "Palindrome";

            if (IsPalindrom(str)) {
                System.out.println("Слово '" + str + "' - палиндром");
            } else {
                System.out.println("Слово '" + str + "' - не являтся палиндромом");

        }
    }
    public static String ReverseStr(String str) {
        String res = "";
        int l = str.length()-1;

        for(int i = l; i >= 0; i--){
            res += str.charAt(i);
        }
        return  res;

    }
    public static boolean IsPalindrom(String str){
        return str.equals(ReverseStr(str));
    }
}
