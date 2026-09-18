import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aArr = new int[a];
        int[] bArr = new int[b];
        for (int i = 0; i < aArr.length; i++){
            aArr[i] = sc.nextInt();

        }

        for (int j = 0; j < bArr.length; j++){
            bArr[j] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 0; i <= a - b; i++){

            boolean match = true;

            for(int j = 0; j < b; j++){

                if(aArr[i + j] != bArr[j]){
                    match = false;
                    break;
                }
            }

            if (match){
                found = true;
                break;
            }
        }
        
        System.out.print(found ? "Yes" : "No");
            
    }
}