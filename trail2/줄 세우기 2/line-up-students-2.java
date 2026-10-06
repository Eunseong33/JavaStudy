import java.util.Scanner;
import java.util.Arrays;

class Member implements Comparable<Member>{
    int height;
    int weight;
    int number;

    public Member(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Member member){
        if (this.height == member.height) { return member.weight - this.weight; }
        return this.height - member.height;
    }

    public String toString(){
        return height + " " + weight + " " + number;
    }

}

public class Main {
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        // Please write your code here.
        Member[] mems = new Member[n];
        for (int i = 0; i < n; i++){
            mems[i] = new Member(h[i], w[i], i + 1);
        }

        Arrays.sort(mems);

        for(Member data : mems){
            System.out.println(data);
        }
    }
}
