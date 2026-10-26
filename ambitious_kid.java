import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int mindist = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++){
                int element = sc.nextInt();
                mindist = Math.min(mindist,Math.abs(0-element));
            }
            System.out.println(mindist);
        }

        sc.close();
    }
}