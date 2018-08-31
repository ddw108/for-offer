package stack;

public class Fibonacci {
    public int Fibonacci(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        while(n-1>0){
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            n--;
        }
        return sum;
    }
}
