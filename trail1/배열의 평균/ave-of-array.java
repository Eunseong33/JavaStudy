import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[2][4];

        int rowNum = numArr.length;
        int colNum = numArr[0].length;

        int totalSum = 0;
        
            for (int i = 0; i < numArr.length; i++){
                int rowSum = 0;
                for (int j = 0; j < numArr[i].length; j++){
                    numArr[i][j] = sc.nextInt();
                    totalSum += numArr[i][j];
                    rowSum += numArr[i][j];
                }
                System.out.printf("%.1f ", rowSum / (double) colNum);
            }
            System.out.println();

        for (int j = 0; j < colNum; j++){
            int colSum = 0;
            for (int i = 0; i < rowNum; i++){
                colSum += numArr[i][j];
            }
            System.out.printf("%.1f ", colSum / (double) rowNum);
        }

        System.out.println();
        System.out.printf("%.1f ", totalSum / (double) (rowNum * colNum));
        
    }

}