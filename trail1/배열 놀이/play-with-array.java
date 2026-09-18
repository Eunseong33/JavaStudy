import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    int[] numArr = new int[n + 1];

    for (int i = 1; i < numArr.length; i++){
        numArr[i] = sc.nextInt();        
        }
    

    for (int i=0; i<q; i++){

        int qNum = sc.nextInt();
    
        switch(qNum) {

        case 1: 
            System.out.println(numArr[sc.nextInt()]);
            break;
        case 2: //값이 5인 배열을 찾아 몇 번째 원소인지 출력, 없으면 0
            int b = sc.nextInt();
            int answer = 0;
            for (int j = 1; j<= n; j++){
                if(numArr[j] == b){
                    answer = j;
                    break;
                }
            }
            
            System.out.println(answer);
            break;

        case 3: //s번째 원소부터 e번째 원소까지 공백두고 출력
            int s = sc.nextInt();
            int e = sc.nextInt();
            for (int k=s; k<=e; k++){            
                System.out.print(numArr[k] + " ");
            } 
            System.out.println();
            break;

        }

    }
}
}