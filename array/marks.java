import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        int i,j,n;
        
        int a[][] = new int [3][3];
        a[0] = new int[3];
        a[1] = new int[5];
        a[2] = new int[4];
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        for(i=0;i<=n;i++){
            System.out.println("Enter "+ (i+1) + " Student marks");
            for (j=0;j<a[i].length;j++){
                a[i][j]=S.nextInt();
                
            }
        }
        for(i=0;i<=n;i++){
            System.out.println("Enter "+(i+1) + " Student marks:");
            for (j=0;j<a[i].length;j++){
                System.out.print(" " +a[i][j]);
            }
            System.out.println();
        }
    }
}
