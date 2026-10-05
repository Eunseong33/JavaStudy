import java.util.Scanner;

class S007{
    String sCode;
    char mPoint;
    int time;

    public S007(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }

    public String toString(){
        return "secret code : " + sCode + "\n"
            + "meeting point : " + mPoint + "\n"
            + "time : " + time; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        S007 s007 = new S007(sCode, mPoint, time);
        System.out.print(s007.toString());
    }
}