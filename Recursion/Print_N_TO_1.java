package Recursion;

public class Print_N_TO_1 {
public void printNToOne(int n)
{
    if (n<1) {
        return;
    }
    System.out.println(n);
    n=n-1;
    printNToOne(n);
}

    public static void main(String[] args) {
    Print_N_TO_1 n= new Print_N_TO_1();
    n.printNToOne(5);
    }
}

