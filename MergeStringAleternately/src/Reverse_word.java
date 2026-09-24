public class Reverse_word {

        public String reverseWords(String s) {
            StringBuilder reverse= new StringBuilder();


            String []word=s.trim().split("\\s+");
            for(int i =word.length-1;i>=0;i--)
            {
                reverse.append(word[i]);
                if(i!=0)
                {
                    reverse.append(" ");
                }
            }

            return reverse.toString();

        }

}
