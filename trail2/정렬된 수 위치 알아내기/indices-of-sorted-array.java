import java.util.Scanner;
import java.util.Arrays;

class Position{
    int value;
    int idx;

    public Position(int value, int idx){
        this.value = value;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Position[] ps = new Position[n];
        for (int i = 0; i < n; i++){
            ps[i] = new Position(arr[i], i + 1);
        }

        Position[] ps2 = ps.clone();

        Arrays.sort(ps2, (a,b) -> {
            if (a.value == b.value) {return Integer.compare(a.idx, b.idx); }
            return Integer.compare(a.value, b.value);
        });

        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            ans[ps2[i].idx - 1] = i + 1;
        }
        for (int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
