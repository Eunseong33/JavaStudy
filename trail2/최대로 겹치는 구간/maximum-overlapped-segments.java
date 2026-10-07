import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int[] line = new int[202];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            line[x1[i] + 100]++;
            line[x2[i] + 100]--;
        }

        int max = 0;
        int current = 0;
        for (int i = 0; i < line.length; i++){
            current += line[i];
            if (max < current){ max = current; }
        }

        System.out.print(max);

    }
}