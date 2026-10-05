import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        System.out.print(sorted);
    }
}