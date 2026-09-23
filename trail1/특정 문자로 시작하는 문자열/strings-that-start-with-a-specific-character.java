import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        char ch = sc.next().charAt(0);
        int cnt = 0, len = 0;
        for (String str : arr){
            if (str.charAt(0) == ch){
                cnt++;
                len += str.length();
            }
        }
        double avg = (cnt == 0) ? 0.00 : len / (double) cnt;
        System.out.printf("%d %.2f", cnt, avg);
    }
}