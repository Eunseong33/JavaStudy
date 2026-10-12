import java.util.Scanner;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
        }

        // Please write your code here.
        int[] arr = new int[1_000_001];
        int time = 0;
        int pos = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < t[i]; j++){ 
                if (d[i] == 'R') pos++;
                else if (d[i] == 'L') pos--;
                time++;
                arr[time] = pos;
            }
        }

        int[] arrM = new int[1_000_001];
        int timeM = 0;
        int posM = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < t2[i]; j++){
                if (d2[i] == 'R') posM++;
                else if (d2[i] == 'L') posM--;
                timeM++;
                arrM[timeM] = posM;
            }
        }

        int maxTime = Math.max(time, timeM);

        for (int i = time + 1; i <= maxTime; i++){
            arr[i] = pos;
        }

        for (int i = timeM + 1; i <= maxTime; i++){
            arrM[i] = posM;
        }


        int ans = -1;
        for (int i = 1; i <= maxTime; i++){
            if(arr[i] == arrM[i]){
                ans = i;
                break;
            }
        }
        System.out.print(ans);

    }
}