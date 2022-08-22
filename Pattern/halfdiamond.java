import java.util.Scanner;
public class halfdiamond {
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        int n= S.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0; j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
