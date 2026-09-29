import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char result = (ch != 'z') ? (char)(ch + 1) : 'a';
        System.out.print(result);
    }
}