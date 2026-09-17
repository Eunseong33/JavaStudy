import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[11];

        while(true){
            int score = sc.nextInt();
            
            if(score == 0){
                break;
            }
            
            countArr[score / 10]++;
        }

        for(int i=(countArr.length - 1); i>0; i--){
            System.out.println((i * 10) + " - " + countArr[i]);
        }
    }
}