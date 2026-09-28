import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                char temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            } else {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);
                
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x) {
                        arr[j] = y;
                    }
                }
            }
            System.out.println(String.valueOf(arr));
        }
    }
}