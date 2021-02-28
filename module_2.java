package Tasks;
import java.util.Scanner;

public class module_2 {
    public static void main(String[] args) {
        Task01();
        Task02();
        Task03();
        Task04();
        Task05();
        Task06();
        Task07();
        Task08();
        Task09();
        Task10();

    }
    public static void Task01(){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int n = sc.nextInt();
        char [] str = l.toCharArray();
        for (int i = 0; i < l.length();i++)
        {
            for (int j = 0;j < n;j++){
                System.out.print(str[i]);
            }
        }
    }
    public static void Task02() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i < n;i++){
            arr[i]=sc.nextInt();
        }
        int max = 1;
        int min = 1;
        for (int i = 0; i < n;i++)
        {
            if (arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
    public static void Task03(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++){
            sum = sum + arr[i];
        }
        double sr = 1.0 * sum / n;
        if (sr * 10 % 10 == 0){
            System.out.print(true);
        }
        else  {
            System.out.print(false);
        }
    }
    public static void Task04(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1;i < n;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Task05(){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int c = 0;
        for (int i = l.length()-1; i >= 0;i--)
        {
            if (l.charAt(i)=='.') {
                System.out.print(c);
            }
            else {
                c += 1;
            }
        }
        if (c!=0) {
            System.out.print(0);
        }
    }
    public static void Task06(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i=1;i < x;i++){
            c = a;
            a = b + a;
            b = c;
        }
        if (x==0){
            System.out.print("Result " + 0);
        }
        else{
            System.out.print("Result " + a);
        }
    }
    public static void Task07(){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        System.out.println(isValid(l));
    }
    public static boolean  isValid(String l){
        boolean z = true;
        if ((l.length()!=5) || (l.indexOf(" ") != -1))
            z = false;
        for (int i = 0; i<5; i++) {
            if (Character.isDigit(l.charAt(i)) == false)
                z = false;
        }
        return z;
    }
    public static void Task08(){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String s = sc.nextLine();
        if (l.charAt(0) == s.charAt(s.length() - 1) && l.charAt(l.length() - 1) == s.charAt(0)){
            System.out.print("Result: "+ true);
        }
        else{
            System.out.print("Result: "+ false);
        }
    }
    public static void Task09(){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String s = sc.nextLine();
        System.out.println("isPrefix");
        isPrefix(l,s);
        System.out.println("isSuffix");
        isSuffix(l,s);
    }
    public static boolean isPrefix(String str1, String str2) {
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean isSuffix(String str1, String str2) {
        int h = 1;
        for (int i = str1.length() - str2.length() + 1; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(h))
                return false;
            h++;
        }
        return true;
    }
    public static void Task10(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                n += 3;
            }
            else
                n -= 1;
        }
        System.out.print(n);
    }
}