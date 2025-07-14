import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine().trim());
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());
            long ans= sol(a,b);
            System.out.println(ans);
        }
    }
    public static long sol(long k,long x){
        long l=1,h=k*x;
        long mid=-1;

        while (l<h) {
            mid=l+(h-l)/2;
            long s= mid-mid/x;
            if(s<k){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
}
