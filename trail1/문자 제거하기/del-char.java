import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        while (sb.length() > 1){
            int n = sc.nextInt();
            if (n >= sb.length()) {
                sb.deleteCharAt(sb.length() - 1);
            } else { 
                sb.deleteCharAt(n);
            }
            System.out.println(sb);
        }
    }
}