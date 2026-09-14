package Recursion;

import com.sun.source.tree.ReturnTree;

public class SumOfFirstN_naturalNumber {
    public int sum=0;
    public void SumofFirst_N_NaturalNumber(int n)
    {
        if (n <1) {
           return;
        }

        sum+=n;
       n=n-1;
        SumofFirst_N_NaturalNumber(n);


    }

    public static void main(String[] args) {
        SumOfFirstN_naturalNumber n= new SumOfFirstN_naturalNumber();
        n.SumofFirst_N_NaturalNumber(5);
        System.out.println(n.sum);
    }
}
