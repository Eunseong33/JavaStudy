import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        findTheLcm(n, m);
    }

    public static void findTheLcm(int n, int m) {
        int a = Math.min(n, m);
        int gcd = 0;
        for (int i = a; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        int lcm = (n * m) / gcd;
        System.out.print(lcm);
    }
}