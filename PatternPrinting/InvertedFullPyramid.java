package PatternPrinting;

public class InvertedFullPyramid {
    InvertedFullPyramid(int n)
    {
        for (int i = n; i >=1; i--) {

           //for spaces
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }
           // for star
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
