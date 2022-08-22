package array;
import java.util.Scanner;

public class rectangle_pattern {
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        int n= S.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
