import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            
            for (int i = k; i >= 1; i--) {
                if (i != x) {
                    while (n >= i) {
                        if (x == 1 && (n - i) == 1) {
                            break; 
                        }
                        arr.add(i);
                        n -= i;
                    }
                }
            }
            
            if (n == 0) {
                System.out.println("YES");
                System.out.println(arr.size());
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
