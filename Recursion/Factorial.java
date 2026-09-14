package Recursion;

public class Factorial {
    public int printfact( int n)
    {


        if (n ==1 || n==0){
            return 1;
        }



        int fact=n*printfact(n-1);



        return fact;

    }

    public static void main(String[] args) {
        Factorial fact= new Factorial();
        System.out.println(fact.printfact(5));
    }

}
