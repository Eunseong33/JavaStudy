import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] row = new int[n];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            row[i] = 1;
            for (int j = i - 1; j > 0; j--){
                row[j] = row[j] + row[j - 1];
            }
        
            for (int j = 0; j <= i; j++){
                sb.append(row[j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}