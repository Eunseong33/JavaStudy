import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(cnt(A, B));
    }
    
    public static int cnt(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++){
            if (contains369(i) || multipleOfThree(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean contains369(int n) {
            String str = Integer.toString(n);
            return str.contains("3") || str.contains("6") || str.contains("9");
    }

    public static boolean multipleOfThree(int n) {
         return n % 3 == 0;
    }
}