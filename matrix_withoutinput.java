public class matrix_withoutinput {
    public static void main(String[] args){
        int a[][] ={{10,20,30},{1,2,3},{5,6,4}};
        int i,j;
        System.out.println("Matrix is :");
        for (i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println( );
        }
    }
}
