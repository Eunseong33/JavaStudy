import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] words = line.split(" ");

        for (String word : words){
            System.out.println(word);
        }  
    }
}