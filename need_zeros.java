import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int xors = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                xors ^= arr[i];
            }
            if(n%2==0 && xors==0) System.out.println(0);
            else if(n%2==0 && xors!=0) System.out.println(-1);
            else System.out.println(xors);
            
        }
        sc.close();
    }
}
