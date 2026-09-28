import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int len = sb.length();

        System.out.println(sb);
        
        for (int i = 0; i < len; i++){
            char lastChar = sb.charAt(len - 1);
            sb.deleteCharAt(len - 1);
            sb.insert(0, lastChar);
            System.out.println(sb);
        }
    }
}