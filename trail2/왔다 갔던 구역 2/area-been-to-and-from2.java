import java.util.Scanner;
public class Main {
    static int loc = 0;
    static int[] line = new int[2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            loc(x, dir);
        }
        int ans = 0;
        int current = 0;
        for (int i = 0; i < line.length; i++){
            current += line[i];
            if (current >= 2) ans++;
        }

        System.out.print(ans);
    }

    public static void loc(int x, char dir){        
            int next;

            if (dir == 'L'){
                next = loc - x;
            } else {
                next = loc + x;
            }

            int start = Math.min(loc, next);
            int end = Math.max(loc, next);

            line[start + 1000]++;
            line[end + 1000]--;

            loc = next;
    }
}