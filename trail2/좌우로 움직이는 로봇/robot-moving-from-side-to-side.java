import java.util.Scanner;

public class Main {
    public static int[] arr = new int[2_000_001];
    public static int[] arrB = new int[2_000_001];
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int cur = 0;
        int curB = 0;
        int pos = 0;
        int posB = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt(); //움직인 거리
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++){
                if(d == 'L'){
                    pos--;
                } else {
                    pos++;
                }
                    arr[++cur] = pos;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++){
                if(d == 'L'){
                    posB--;
                } else {
                    posB++;
                }
                    arrB[++curB] = posB;
            }
        }
    
        int maxTime = Math.max(cur, curB);
        for (int i = cur + 1; i <= maxTime; i++){
            arr[i] = pos;
        }
        for (int i = curB + 1; i <= maxTime; i++){
            arrB[i] = posB;
        }

        int cnt = 0;
        // Please write your code here.
        for (int i = 1; i <= maxTime; i++){
            if (arr[i - 1] != arrB[i - 1] && arr[i] == arrB[i]) cnt++;
        }

        System.out.print(cnt);
    }
}