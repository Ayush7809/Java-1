import java.util.Scanner;
public class matrixs{
    public static void main(String[] args){
        int i,j,n,m,a[][] = new int [100][100];
        Scanner S= new Scanner(System.in);
        n=S.nextInt();
        m=S.nextInt();
        System.out.println("enter 3x3 matrics");
        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                a[i][j] = S.nextInt();
            }
        }
        System.out.println("3x3 matrix is : \n");
        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println(' ');
        }
    }
    
}