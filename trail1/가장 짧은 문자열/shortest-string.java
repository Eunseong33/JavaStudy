import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int len1 = sc.next().length();
        int len2 = sc.next().length();
        int len3 = sc.next().length();

        int max = Math.max(len1, Math.max(len2, len3));
        int min = Math.min(len1, Math.min(len2, len3));

        System.out.print(max - min);
    }
}