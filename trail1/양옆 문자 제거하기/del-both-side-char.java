import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        sb.deleteCharAt(sb.length() - 2);
        sb.deleteCharAt(1);
        
        System.out.print(sb);
    }
}