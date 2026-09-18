import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){

            if (map.get(arr[i]) == 1 && arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print( max == Integer.MIN_VALUE ? -1 : max );
    }
}