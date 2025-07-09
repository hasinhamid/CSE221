import java.util.Scanner;
public class ArithExp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String input= sc.nextLine().replace("calculate", "");
            input=input.replace(" ", "");
            float ans=0;
            if(input.contains("+")){
                String[] temp= input.split("\\+");
                ans= (float)Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
            }
            else if(input.contains("/")){
                String[] temp= input.split("\\/");
                ans= (float)Integer.parseInt(temp[0])/Integer.parseInt(temp[1]);
            }
            else if(input.contains("*")){
                String[] temp= input.split("\\*");
                ans= (float)Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
            }
            else if(input.contains("-")){
                String[] temp= input.split("\\-");
                ans= (float)Integer.parseInt(temp[0])-Integer.parseInt(temp[1]);
            }
            System.out.println(ans);

        }
    }
}