package Recursion;

public class Print_Upto_N_Numbers {
    public void PrintNumber(int i,int n){
        if (i>n) {
            return;
        }

        System.out.println(i);

        PrintNumber(i+1,n);
    }
    public static void main(String[] args) {
        Print_Upto_N_Numbers n= new Print_Upto_N_Numbers();
        n.PrintNumber(1,5);
    }
}
