import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //a 이동횟수
        int m = sc.nextInt(); //b 이동횟수
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); //속도 speed
            A[i][1] = sc.nextInt(); //시간 duration
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int[] disA = new int[1_000_001];
        int tA = 0;
        int distA = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < A[i][1]; j++){
                distA += A[i][0];
                disA[++tA] = distA;
            }
        }


        int[] disB = new int[1_000_001];
        int tB = 0; // 누적 이동 시간
        int distB = 0; //누적 이동 거리
        for (int i = 0; i < m; i++){
            for (int j = 0; j < B[i][1]; j++){
                distB += B[i][0];
                disB[++tB] = distB;
            }
        }
        
        int maxTime = Math.max(tB, tA);

        for (int i = tA + 1; i <= maxTime; i++) disA[i] = distA;
        for (int i = tB + 1; i <= maxTime; i++) disB[i] = distB;
        

        int cnt = 0;
        int lastLeader = 0;
        for (int i = 1; i <= maxTime; i++){
            int curLeader = 0;
            if (disA[i] > disB[i]) curLeader = 1;
            else if (disA[i] < disB[i]) curLeader =2;

            if (curLeader == 0) continue;

            if (lastLeader != 0 && curLeader != lastLeader) cnt++;

            lastLeader = curLeader;
        }
        
        System.out.print(cnt);
    }
}