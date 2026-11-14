import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int p = 1;
            while(p*10 <= n){
                ans += 9;
                p *= 10;
            }
            ans += n/p;
            System.out.println(ans);
        }
        sc.close();
    }
}
