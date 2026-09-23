public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }    

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){                
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }   
      
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }   
       System.out.print(sb); 
    }
} 