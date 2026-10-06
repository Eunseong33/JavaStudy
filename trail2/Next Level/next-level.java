import java.util.Scanner;

class Member{
    String id;
    int level;

    public Member(){
        this.id = "codetree";
        this.level = 10;
    }

    public Member(String id, int level){
        this.id = id;
        this.level = level;
    }

    public String toString(){
        return "user " + id 
            + " lv " + level;
    }
 }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Member m1 = new Member();
        Member m2 = new Member(id, level);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}