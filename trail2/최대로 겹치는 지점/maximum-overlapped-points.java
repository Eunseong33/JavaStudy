import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] line = new int[102];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            
            line[start[i]]++;
            line[end[i] + 1]--;
        }
        // Please write your code here.
        int max = 0;
        int current = 0;
        for (int i = 1; i < line.length; i++){
            current += line[i];
            if(current > max) max = current;
        }

        System.out.print(max);

    }
}