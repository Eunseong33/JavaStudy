import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStars(n);
    }

    public static void printStars(int n){
        if (n == 0) return;
        for (int i = 1; i <= n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        printStars(n - 1);
        for (int i = 1; i <= n; i++){
                System.out.print("*" + " ");
        }
        System.out.println();

    }
}