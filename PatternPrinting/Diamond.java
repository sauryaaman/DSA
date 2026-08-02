package PatternPrinting;

public class Diamond {
    Diamond(int n)
    {
        //for upward
        for (int i = 1; i <=n ; i++) {
            //for spaces
            for (int k = 1; k<=n-i ; k++) {
                System.out.print(" ");
            }

            //for star
            for (int j =1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // for backward

        for (int i =n; i >=1 ; i--) {

            //for spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //for stars

            for (int j =1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
        

}
