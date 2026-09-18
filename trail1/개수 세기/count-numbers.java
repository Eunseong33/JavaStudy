import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        int cnt = 0;

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            if (arr[i] == x){
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}