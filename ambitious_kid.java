import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long mindist = Long.MAX_VALUE;
        for (int i = 0; i < N; i++){
            int element = sc.nextInt(); 
            mindist = Math.min(mindist,Math.abs((long)element));
        }
        System.out.println(mindist);
    }
}