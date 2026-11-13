import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int minop = 0;
            for(int i = 0;i<n-1;i++){
                if(a[i]%2==0 && a[i+1]%2==0){
                    minop++;
                }
                if(a[i]%2!=0 && a[i+1]%2!=0){
                    minop++;
                }
            }
            System.out.println(minop);
        }
        sc.close();
    }
}
