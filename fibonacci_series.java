public class fibonacci_series {
    public static void main(String[] args){
        int x,y,c,n=10;
        x=0; 
        y=1;
        System.out.print(x +" " +y);
        for(int i=0;i<=n;i++){
            c=x+y;
            System.out.print( " "+c);
            x=y;
            y=c;
       }
       /*int i=0;
       while(i<=n){
        c=x+y;
        System.out.print( " "+c);
        x=y;
        y=c;  
        i++;
       }*/
    }
}


   


