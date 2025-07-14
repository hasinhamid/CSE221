import java.util.Scanner;

public class problemE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cursed = new int[n];

        for (int i = 0; i < n; i++) {
            cursed[i] = sc.nextInt();
        }

        for (int x = 1; x <= 1_000_000; x++) {
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (x % cursed[i] == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println(x);
                return;
            }
        }
        System.out.println(-1);
    }
}