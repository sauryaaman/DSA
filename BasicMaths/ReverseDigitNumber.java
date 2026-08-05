package BasicMaths;

public class ReverseDigitNumber {
    ReverseDigitNumber(int n)
    {
        int x=n;
        int reverseNumber=0;

        while (x>0) {
              int lastDigit= x%10;
             reverseNumber=reverseNumber*10+ lastDigit;

             x=x/10;


        }
        System.out.println("reverse digit of "+ n+ " is : " +reverseNumber);

    }
}
