import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                sum += a;
            }
            if(sum%2==0) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
