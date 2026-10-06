import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Member {
    String name;
    int height;
    int weight;

    public Member(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return name + " " + height + " " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        // Please write your code here.
        Member[] members = new Member[n];
        for (int i = 0; i < n; i++){
            members[i] = new Member(name[i], height[i], weight[i]);
        }

        Arrays.sort(members, 
                    Comparator.comparingInt((Member m) -> m.height)
                            .thenComparing((Member m) -> m.weight, Comparator.reverseOrder()));

        for (Member data : members) {
            System.out.println(data);
        }
        
    }
}
