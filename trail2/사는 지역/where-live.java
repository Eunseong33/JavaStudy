import java.util.Scanner;

class Member{
    String name;
    String address;
    String region;

    public Member(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }

    public String toString(){
        return "name " + name + "\n"
            + "addr " + address + "\n"
            + "city " + region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] address = new String[n];
        String[] region = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            address[i] = sc.next();
            region[i] = sc.next();
        }

        // Please write your code here.
        Member[] members = new Member[n];
        
        for (int i = 0; i < n; i++){
            members[i] = new Member(name[i], address[i], region[i]);
        }

        int maxIdx = 0;
        for (int i = 1; i < n; i++){
            if(members[i].name.compareTo(members[maxIdx].name) > 0){
                maxIdx = i;
            }
        }

        System.out.print(members[maxIdx]);
        
    }
}
