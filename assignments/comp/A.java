
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long N= Integer.parseInt(br.readLine().trim());
        long a=(N+2)/3;
        System.out.println(a);
    }
}
