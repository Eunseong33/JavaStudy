import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        if (sb.length() >= 2){
            sb.setCharAt(1, 'a');
            sb.setCharAt(sb.length() -2, 'a');
        }
        System.out.print(sb);
    }
}