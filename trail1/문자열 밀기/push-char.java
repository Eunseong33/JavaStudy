import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() <= 1){
            System.out.print(str);
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        System.out.print(sb);
    }
}