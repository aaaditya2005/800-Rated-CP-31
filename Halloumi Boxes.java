import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] copy = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                copy[i] = a[i];
            }

            Arrays.sort(copy);

            boolean sorted = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != copy[i]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(sorted || k > 1 ? "YES" : "NO");
        }

        sc.close();
    }
}