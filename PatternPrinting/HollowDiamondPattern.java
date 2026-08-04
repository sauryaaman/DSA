package PatternPrinting;

public class HollowDiamondPattern {
    HollowDiamondPattern(int n)
    {
        //upper pattern

        for (int i = 0; i <n ; i++) {

            //for stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }

            //for spaces

            for (int j = 0; j <2*i; j++) {
                System.out.print(" ");
            }
            //right stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }

            //

            System.out.println();
        }
        
        //downward pattern

        for (int i = 1; i < n; i++) {

            // left stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
