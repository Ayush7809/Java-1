import java.util.*;
import static java.lang.System.out;
public class pattern_2 {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        int n= S.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
            out.print(num++ +" ");
          }
          out.println();
        }
      }
}
