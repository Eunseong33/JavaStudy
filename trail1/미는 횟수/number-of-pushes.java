import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len = str1.length();
        for (int i = 1; i < len; i++){
            str1 = str1.charAt(len - 1) + str1.substring(0, len - 1);
            if (str1.equals(str2)){ System.out.print(i); return; }
        }        
        System.out.print(-1);

    }
}