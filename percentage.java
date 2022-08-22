import java.util.Scanner;
public class percentage {

    public static void main(String[] args){
        System.out.println("Enter the marks");
        Scanner m= new Scanner(System.in);
        System.out.println("Enter subject mark");
        int sub1=m.nextInt();
        int sub2=m.nextInt();
        int sub3=m.nextInt();
        int sub4=m.nextInt();
        int sub5=m.nextInt();
        int t=m.nextInt();
        float s= (sub1+sub2+sub3+sub4+sub5);
        System.out.println("total:"+s);
        float per=(s/t)*100; 
        System.out.println("percentage is:"+per);
    }
}
