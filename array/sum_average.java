import java.util.*;
public class sum_average {
    public static void main(String[] args){
        int n,t, sum=0;
        float avg , percentage ;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the maximum no of subject");
        t=S.nextInt();
        System.out.println("Enter the element of array");
        n= S.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all element of an array");
        for(int i=0; i<n;i++){
            a[i]=S.nextInt();
            sum +=a[i];
        }
        System.out.println("Sum is:"+sum);
        avg = (float)sum/n;
        System.out.println("Average is :"+avg);
        int total= t*n;
        percentage =(float) sum/total*(100);
        System.out.println("percentage is :"+percentage);
    }
}
