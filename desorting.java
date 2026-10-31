import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean isSorted = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(i > 0 && arr[i] < arr[i - 1]) {
                    isSorted = false;
                }
            }
            if(!isSorted) {
                System.out.println(0);
            } else {
                int minop = Integer.MAX_VALUE;
                for(int i =0;i<n-1;i++){
                    int curr = 1 + Math.abs(arr[i]-arr[i+1])/2;
                    minop = Math.min(minop,curr);
                }
                System.out.println(minop);
            }
        }
        sc.close();
    }
}
