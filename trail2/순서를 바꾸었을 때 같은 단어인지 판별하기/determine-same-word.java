import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String w1 = new String(ch1);
        String w2 = new String(ch2);

        System.out.print(w1.equals(w2) ? "Yes" : "No");
    }
}