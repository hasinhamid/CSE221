import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int len=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int[] arr= new int[len];
        for(int i=0;i<len;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int ans= sol(arr,a,b);
            System.out.println(ans);
        }
    }
    public static int sol(int[] arr, int a, int b){
        int i= low(arr,a);
        int j=hi(arr,b);

        return j-i;

    }
    public static int low(int[] arr, int a) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < a) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static int hi(int[] arr, int b) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= b) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
