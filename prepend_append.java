import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int i =0;
            int j = n-1;
            int count = 0;
            while(i<j && s.charAt(i) != s.charAt(j)){
                count = count + 2;
                i++;
                j--;
            }
            System.out.println(n-count);
        }
        sc.close();
    }
}
