import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        int b = sc.next().charAt(0);
        System.out.print((a + b) + " " + Math.abs(a-b));
    }
}