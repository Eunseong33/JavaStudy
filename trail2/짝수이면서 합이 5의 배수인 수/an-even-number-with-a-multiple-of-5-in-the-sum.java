import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if (evenFive(n)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean evenFive(int n) {
        int num = (n / 10) + (n % 10);
        if (n % 2 == 0 && num % 5 == 0){        
            return true;
        }
        return false;
    }
}