import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long[] presum = new long[n];
            long totalsum = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                int isTwo = (a[i] == 2) ? 1 : 0;
                totalsum += isTwo;
                if (i != 0) presum[i] = presum[i - 1] + isTwo;
                if (i == 0) presum[i] = isTwo;

            }
            
            int k = -1;
            for (int i = 0; i < n - 1; i++) {
                if (presum[i] == totalsum - presum[i]) {
                    k = i+1;
                    break;
                }
            }
            System.out.println(k);
        }
        sc.close();
    }
}
