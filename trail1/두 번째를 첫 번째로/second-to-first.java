import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        char t = arr[0];
        char a = arr[1];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == a){
                arr[i] = t;
            }
        }
        System.out.print(arr);
    }
}