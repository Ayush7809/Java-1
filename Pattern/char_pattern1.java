import java.util.Scanner;

public class char_pattern1 {
    public static void main(String[] args){
        int alpha=65;
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
          for(int j=0;j<=i;j++){
            System.out.print((char)(alpha+j)+ " ");
          }
          System.out.println();
        }
      }
}
