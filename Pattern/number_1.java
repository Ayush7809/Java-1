import java.util.Scanner;
public class number_1 {
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        int n=S.nextInt();
        for(int i=0;i<n;i++){
          int num=1;
          for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num++;
          }
          System.out.println();
        }
       }
}
