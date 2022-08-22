
import java.util.Scanner;

public class char_pattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int letter=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)letter +" ");
            }
            letter++;
            System.out.println();
        }
    }
}
