import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        int n= S.nextInt();
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
            System.out.print(i +" ");
          }
          System.out.println();
        }
      }
}
