package BasicMaths;

public class CountAllDigitOfaNumber{




    int CountAllDigitOfaNumber(int n)
    {




//       String s= String.valueOf(n);
//       System.out.println(s.length());


//        String s=Integer.toString(n);
//        System.out.println(s.length());

        int x=n;
        int count=0;
         int remainder=0;
        while(x>0)
        {
            x=x/10;

            count++;



        }
        return count;



    }
}
