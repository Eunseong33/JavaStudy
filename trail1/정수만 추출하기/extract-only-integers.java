import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if (ch > '9' || ch < '0'){
                break;
            } 
            num1 = num1 * 10 + (ch - '0');
        }

        for (int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if (ch > '9' || ch < '0'){
                break;
            }
            num2 = num2 * 10 + (ch - '0');
        }
        System.out.print(num1 + num2);
    }
}