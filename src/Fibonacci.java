public class Fibonacci {
    public int FibonacciNumber(int n){
        if(n<=0)
            return 0;

        if(n==1 || n==2)
            return 1;

        else return FibonacciNumber(n-1)+FibonacciNumber(n-2);
    }
}
