import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int curr = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if(ele==0) curr++;
                else{
                    max = Math.max(max, curr);
                    curr = 0;
                }
            }
            max = Math.max(max, curr);
            System.out.println(max);
        }
        sc.close();
    }
}