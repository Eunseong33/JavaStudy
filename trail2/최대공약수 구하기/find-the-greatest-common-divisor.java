import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        gcd(n, m);
    }

    public static void gcd(int n, int m) {
        int a = Math.min(n, m);
        for (int i = a; i >= 1; i--) {
            if(n % i == 0 && m % i == 0) {
                System.out.println(i);
                return;
            }
        }
        
    }
}