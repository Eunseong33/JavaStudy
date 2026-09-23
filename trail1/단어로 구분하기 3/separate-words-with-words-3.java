import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--){
            System.out.println(words[i]);
        }
    }
}