import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(c>a+(d-b) || d-b < 0 ) System.out.println(-1);
            else{
                int ans = a + 2*(d-b) - c;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
