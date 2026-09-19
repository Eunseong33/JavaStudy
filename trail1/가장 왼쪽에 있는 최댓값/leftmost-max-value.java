import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        int max = arr[0];
        list.add(1);

        for (int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                list.add(i+1);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}