import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++){
                int ele = sc.nextInt();
                if(i==0) arr.add(ele);
                else{
                    if(ele>=arr.get(arr.size()-1)){
                        arr.add(ele);
                    }else{
                        arr.add(ele);
                        arr.add(ele);
                    }
                }
            }
            System.out.println(arr.size());
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
        }
        sc.close();
    }
}
