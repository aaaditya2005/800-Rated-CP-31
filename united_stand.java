import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0] == arr[n - 1]) System.out.println(-1);
            else{
                ArrayList<Integer> b = new ArrayList<>();
                ArrayList<Integer> c = new ArrayList<>();
                int maxVal = arr[n-1];
                for (int i = 0; i < n; i++){
                    if (arr[i] == maxVal) c.add(arr[i]);
                    else b.add(arr[i]);
                }
                System.out.println(b.size() + " " + c.size());
                for (int ele : b) {
                    System.out.print(ele + " ");
                }
                System.out.println();
                for (int ele : c) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
