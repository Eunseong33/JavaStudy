import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            if (num < min){
                min = num;
                cnt = 1;
            } else if (num == min){
                cnt++;
            }

        }

        System.out.print(min + " " + cnt);
    }
}