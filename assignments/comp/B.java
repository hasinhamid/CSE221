import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        String ruh=Integer.toBinaryString(a);
        String arm= Integer.toBinaryString(b);
        int n=10, r=ruh.length(),ar=arm.length();
        StringBuilder ruhan= new StringBuilder(ruh);
        StringBuilder arman= new StringBuilder(arm);
        while (r<n) {
            ruhan.insert(0, "0");
            r++;
        }
        while (ar<n) {
            arman.insert(0, "0");
            ar++;
        }
        System.out.println(ruhan.toString()+" vs "+arman.toString());
        int i=0,j=9;
        int ruh_num=0,tie=0,arm_num=0;
        while(i<10){
            int num1=Integer.parseInt(ruhan.charAt(j)+"");
            int num2=Integer.parseInt(arman.charAt(i)+"");
            if (num1>num2) {
                ruh_num++;
            }
            else if (num1<num2) {
                arm_num++;
            }
            else{
                tie++;
            }
            i++;
            j--;
        }
        System.out.println("Ruhan: "+ruh_num);
        System.out.println("Arman: "+arm_num);
        System.out.println("Tied: "+tie);



    }
}
