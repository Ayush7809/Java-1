import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
          for(int j=n;j>=i;j--){
            System.out.print(j+" ");
          }
          System.out.println();
        }
        
      }
}
