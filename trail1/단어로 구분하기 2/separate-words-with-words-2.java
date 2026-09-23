import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] words = line.split(" ");
        
        for (int i = 0; i < words.length; i += 2){
            System.out.println(words[i]);
        }
    }
}