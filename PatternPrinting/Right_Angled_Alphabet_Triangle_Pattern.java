package PatternPrinting;

public class Right_Angled_Alphabet_Triangle_Pattern {
    Right_Angled_Alphabet_Triangle_Pattern(int n)
    {

        for (int i = 1; i <=n ; i++) {
            char ch= 'A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}
