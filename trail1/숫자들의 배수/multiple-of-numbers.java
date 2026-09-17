import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        int[] arr = new int[100];
        int count = 0;
        int i = 0;

        while (count < 2){
            arr[i] = num * (i + 1);

            if (arr[i] % 5 == 0){
                count++;
            }

            i++;
        }

        for (int j=0; j < i; j++){
             System.out.printf("%d ", arr[j]);
        }
    }
}