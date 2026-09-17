import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int[] placement = new int[4];

        for (int i = 0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            String symptom = st.nextToken();
            int temperature = Integer.parseInt(st.nextToken());

            if(symptom.equals("Y") && temperature >= 37){
                placement[0]++;
            } else if(symptom.equals("N") && temperature >= 37){
                placement[1]++;
            } else if( symptom.equals("Y") && temperature < 37){
                placement[2]++;
            } else {
                placement[3]++;
            }

        }

        for (int i=0; i<placement.length; i++){
            System.out.print(placement[i]+ " ");
        }
        
        if (placement[0] >= 2){
            System.out.print("E");
        }
    }
}