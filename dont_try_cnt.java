import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m  = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int ans = 0;
            boolean found = false;

           for (int i = 0; i <= 5; i++) {
                if (x.contains(s)){
                    found = true;
                    break;
                }
                x = x + x;
                ans++;
            }
            System.out.println(found ? ans : -1);
        }

        sc.close();
    }
}