package BasicMaths;

public class GCD {

    //using euclidean Algorithm
    GCD(int a, int b )
    {
        while(a > 0 && b>0)
        {
            if (a>b)
                a=a%b;
            else
                b=b%a;
        }

        if (a == 0) {
            System.out.println("GCD is"+ b) ;
        }
        else {
            System.out.println("GCD is " +a);
        }

    }
}
