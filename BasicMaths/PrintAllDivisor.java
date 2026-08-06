package BasicMaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintAllDivisor {

    PrintAllDivisor(int n)
    {
        //1st approach which has taken O(n) time complexity

//        for (int i=1;i<n;i++)
//        {
//            if (n%i == 0) {
//                System.out.println(i);
//            }
//        }

        //best approach iterate the  nmber upto sqaure root on n

        Set <Integer> shortedDivisor= new TreeSet<>();


//        for (int i = 1; i <=Math.sqrt(n); i++)
        for (int i = 1; i*i<n; i++)

        {
            if (n%i == 0) {
                shortedDivisor.add(i);
//                System.out.println(i);

                if (n/i != i) {
                    shortedDivisor.add(n/i);
//                    System.out.println(n/i);
                }
            }
        }

        System.out.println(shortedDivisor);

        //store this approach data into list or treeSet bcz this   apptoach not give the data into shorted way like above
    }
}
