package PatternPrinting;

public class RectangleofNSize {
   RectangleofNSize(int n){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.print("*");
           }
           System.out.println();

       }
   }
}
