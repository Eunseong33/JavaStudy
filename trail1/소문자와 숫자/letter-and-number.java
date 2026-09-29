import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch + 32));
            } else if (ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}