import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++){
            int next = b + (2 * a);
        
            System.out.print(next+ " ");

            a = b;
            b = next;

        }
    }
}