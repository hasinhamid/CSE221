import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String[] arr= new String[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        info[] details= new info[n];
        for (int i=0;i<n;i++) {
            String[] ar= arr[i].split(" ");
            String name= ar[0];
            String time= ar[ar.length-1];
            details[i]=new info(name, time);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                info ptr1= details[j];
                info ptr2= details[j+1];
                int lex= ptr1.name.compareTo(ptr2.name);
                if (lex>0) {
                    details[j]=ptr2;
                    details[j+1]=ptr1;
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if(lex==0){
                    if (ptr1.time<ptr2.time) {
                        details[j]=ptr2;
                        details[j+1]=ptr1;
                        String temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        
        for (String i : arr) {
            System.out.println(i);
            
        }
    }
}
class info{
    String name;
    float time;
    public info(String n, String t){
        name=n;
        String[] ss= t.split("\\:");
        time=Integer.parseInt(ss[0])+(Integer.parseInt(ss[1])/60.0f);
    }
}
