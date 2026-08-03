package PatternPrinting;

public class inverted_Right_Angled_Alphabet_Triangle_Pattern {
    inverted_Right_Angled_Alphabet_Triangle_Pattern(int n)
    {
        for (int i = n; i >=1 ; i--) {
            char ch= 'A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
