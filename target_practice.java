import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int ans = 0;
            for (int i = 0; i < 10; i++){
                String S = sc.next();
                for (int j = 0; j < 10; j++){
                    if (S.charAt(j) == 'X') {
                        ans += Math.min(Math.min(i, j), Math.min(9-i, 9-j)) + 1;
                    }
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}