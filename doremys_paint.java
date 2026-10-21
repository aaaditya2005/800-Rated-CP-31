import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            if(map.size()==1) System.out.println("YES");
            else if(map.size()!=2) System.out.println("NO");
            else{
                List<Integer> counts = new ArrayList<>(map.values());
                int f1 = counts.get(0);
                int f2 = counts.get(1);

                if (Math.abs(f1 - f2) <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            
        }

        sc.close();
    }
}