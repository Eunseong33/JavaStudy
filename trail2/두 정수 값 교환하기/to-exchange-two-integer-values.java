import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[] result = swap(n, m);
        n = result[0];
        m = result[1];
        System.out.print(n + " " + m);
    }

    public static int[] swap(int n, int m) {
        int temp = n;
        n = m;
        m = temp;
        return new int[]{n, m};
    }
}