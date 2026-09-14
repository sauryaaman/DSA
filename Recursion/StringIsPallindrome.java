package Recursion;



public class StringIsPallindrome {
    public boolean isStringPallindrome( int n , String s)
    {
        if (n >= s.length()/2) {
       return true;
        }
        if (s.charAt(n)!= s.charAt(s.length()-n-1))
        {
            return false;
        }
       return  isStringPallindrome(n+1,s);
    }

    public static void main(String[] args) {
        StringIsPallindrome isPallindrome= new StringIsPallindrome();

        String s= "madam";

        System.out.println( isPallindrome.isStringPallindrome(0,s));


    }
}
