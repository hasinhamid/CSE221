import java.util.Scanner;

public class TaskE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());

        String[] input = sc.nextLine().split(" ");

        int[] array = new int[length];

        for (int j = 0; j < length; j++) {
            array[j] = Integer.parseInt(input[j]);

        }

        int temp = 0;

        for (int j = 0; j < length - 1; j++) {

            for (int i = 0; i < length - 2; i++) {
                if (array[i] > array[i + 2]) {
                    temp = array[i];
                    array[i] = array[i + 2];
                    array[i + 2] = temp;
                }
            }
        }

        Boolean increasing = true;

        for (int k = 0; k < length - 1; k++) {

            if (array[k] > array[k + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing == true) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }

    }
}