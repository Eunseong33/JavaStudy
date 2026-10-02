import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printOneToN(n);
        System.out.println();
        printNToOne(n);
    }

    public static void printOneToN(int n){
        if (n == 0) return;
        printOneToN(n - 1);
        System.out.print(n + " ");
    }

    public static void printNToOne(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        printNToOne(n - 1);
    }
}