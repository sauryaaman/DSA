package PatternPrinting;

public class Floyd_Triangle_ContinuousNUmberTrainglePattern {

    Floyd_Triangle_ContinuousNUmberTrainglePattern(int n)
    {
        int num=1;
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
