package PatternPrinting;

public class Repeated_Alphabet_Triangle_Pattern {
   Repeated_Alphabet_Triangle_Pattern(int n)
   {
       char ch ='A';
       for (int i =1; i <n ; i++) {
           for (int j =1; j <=i ; j++) {
               System.out.print(ch);
           }
           ch++;
           System.out.println();
       }
   }
}
