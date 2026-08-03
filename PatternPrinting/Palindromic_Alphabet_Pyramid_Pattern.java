package PatternPrinting;

public class Palindromic_Alphabet_Pyramid_Pattern {
    Palindromic_Alphabet_Pyramid_Pattern(int n)
    {
        for (int i = 1; i <=n; i++) {

            // for spaces
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //for char
           char  ch = 'A';
            for (int j =1; j <=2*i -1 ; j++) {
                System.out.print(ch);
                if (j <i) {

                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println();

        }
    }
}
