import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0;
            int pos = 0;
            for(int i =0;i<n;i++){
                int ele = sc.nextInt();
                if(ele<0) neg++;
                else if(ele>0) pos++;
            }
            int ans = 0;
            while(neg>pos){
                neg--;
                pos++;
                ans++;
            }
            if(neg%2!=0) ans++;
            System.out.println(ans);
        }

        sc.close();
    }
}