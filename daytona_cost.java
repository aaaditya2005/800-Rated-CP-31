import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            boolean found = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == k) {
                    found = true;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}