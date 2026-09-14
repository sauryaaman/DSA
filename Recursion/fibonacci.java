package Recursion;


public class fibonacci {
    int i;



    public int fibonaaci(int n)
{
if(n<=1)
{
 return n;
}

return fibonaaci(n-1)+fibonaaci(n-2);

}

    public static void main(String[] args) {
     fibonacci fib= new fibonacci();
        System.out.println(fib.fibonaaci(7));
    }

}
