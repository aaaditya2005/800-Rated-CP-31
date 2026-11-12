import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int uptosum = 0;
            int[] arr = new int[n];
            boolean beautiful = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(uptosum==arr[i]){
                    beautiful = false;
                }
                uptosum += arr[i];
            }
            if(beautiful){
                System.out.println("YES");
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{ 
                if (arr[0] == arr[n - 1]) {
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                    System.out.print(arr[n - 1] + " ");
                    for (int i = 0; i < n - 1; i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
