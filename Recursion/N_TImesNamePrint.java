package Recursion;

import BasicMaths.PrintAllDivisor;

public class N_TImesNamePrint {
    public void  PrintName(String name,int n){
        if (n == 0) {
            return;
        }
        System.out.println("Name is " + name);
        n--;

        PrintName("Aman",n);
    }
    public static void main(String[] args) {
         N_TImesNamePrint n= new N_TImesNamePrint();
         n.PrintName("Aman",5);
    }
}
