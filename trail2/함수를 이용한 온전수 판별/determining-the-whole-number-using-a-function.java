import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(countCleanNumbers(a, b));
    }

    public static int countCleanNumbers(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++){
            if (isNotDividedBy2(i) 
                    && oneDigitIsNot5(i) 
                    && (i % 3 != 0 || i % 9 == 0) ) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isNotDividedBy2(int n) {
        return n % 2 != 0;
    }

    public static boolean oneDigitIsNot5(int n) {
        return n % 10 != 5;
    }


}