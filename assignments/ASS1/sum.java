import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            long N = sc.nextInt();  
            long sum = N*(N+1)/2;
            System.out.println(sum);
        }
    }
}