import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxUnder500 = Integer.MIN_VALUE;
        int minOver500 = Integer.MAX_VALUE;

        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            
            if(num < 500) {
                maxUnder500 = Math.max(maxUnder500, num);
            } else {  
                minOver500 = Math.min(minOver500, num);
            }
        }

        System.out.print(maxUnder500 + " " + minOver500);
    }
}
