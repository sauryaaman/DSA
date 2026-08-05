package BasicMaths;

public class PallindromeNumber {

    public void  isPallindrome(int n)
    {
        int  original_Number= n;
        int Reverse_Number=0;


        while(original_Number>0)
        {
            int lastDigit= original_Number%10;
             Reverse_Number =Reverse_Number*10 +lastDigit;

             original_Number=original_Number/10;



        }
        System.out.println( "original numner : " +n);

        System.out.println("Reverse NUmber :"+Reverse_Number);


        System.out.println(n== Reverse_Number ? " number is pallindrome" :"  is not pallindrome");


    }
}
