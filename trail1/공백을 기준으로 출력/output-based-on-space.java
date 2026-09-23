import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().replace(" ", "");
        String str2 = br.readLine().replace(" ", "");

        System.out.print(str1 + str2);
    }
}