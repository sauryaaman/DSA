package BasicMaths;

public class ArmStrongNUmber {

    ArmStrongNUmber(int n)
    {
        int x=n;
        int sum=0;
        while(x>0)
        {
            int lastDigit= x%10;

            sum=sum+ (lastDigit*lastDigit*lastDigit);
            x=x/10;

        }
        System.out.println((n==sum) ? "Number is ArmStrong" :"Number is not ArmStrong");
    }
}
