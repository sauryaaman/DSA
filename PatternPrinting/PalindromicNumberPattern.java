package PatternPrinting;

public class PalindromicNumberPattern {

    PalindromicNumberPattern(int n) {

        for (int i = 1; i <= n; i++) {

            // Left side: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // Right side: i to 1
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}