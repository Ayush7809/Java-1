public class fibonacci_method {
    public static void Fibonacci(int n)
    {
        int x= 0, y = 1;
        System.out.print(x+" "+y);
        int i = 0;
        while (i <=n) {               
            int c = x+y;
            System.out.print(" "+ c);
            x=y;
            y=c;
            i++;
        }
    }
    public static void main(String[] args){
        int n = 10;
        Fibonacci(n);
    }
}
