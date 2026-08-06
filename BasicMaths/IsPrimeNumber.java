package BasicMaths;

public class IsPrimeNumber {
    IsPrimeNumber(int n)
    {
        int count=0;

        for(int i=1; i<=Math.sqrt(n);i++)
        {
            if(n!=1) {
                if (n % i == 0) {
                    count++;
                    if (n / i != i) {
                        count++;
                    }
                }
            }else {
                System.out.println(n +" is neither Prime Number nor Composite Number");
            }
        }
        //System.out.println((count <=2 && n!=1) ? "Number is  Prime Number" : (n>1) ? "Number is Not Prime Number || It is Composite Number ":" It is Neither Prime Nor Composite Number");

        if(n!=1)
            System.out.println( n + (count<=2 ? " It is prime Number" : " It is Composite Number"));
    }
}
