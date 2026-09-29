import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (str.equals(sc.next())){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}