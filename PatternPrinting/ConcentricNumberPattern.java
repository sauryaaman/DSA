package PatternPrinting;

public class ConcentricNumberPattern {
    ConcentricNumberPattern(int n)
    {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    System.out.print(n + " ");
                }

                else if (i == 1 || j == 1 || i == size - 2 || j == size - 2) {
                    System.out.print((n - 1) + " ");
                }

                else if (i == 2 || j == 2 || i == size - 3 || j == size - 3) {
                    System.out.print((n - 2) + " ");
                }

                else {
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
    }
}
