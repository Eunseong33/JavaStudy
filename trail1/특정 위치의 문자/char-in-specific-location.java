import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String[] letters = {"L", "E", "B", "R", "O", "S" };

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean found = false;

        for(int i = 0; i<letters.length; i++){
            if (letters[i].equals(input)){
                System.out.print(i);
                found = true;
                break;
            } 
        }
            if (!found){
                System.out.print("None");
            } 

    }
}