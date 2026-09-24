import java.sql.SQLOutput;

public class LastWordLength {
    public LastWordLength(String s) {

        String [] word=s.split(" ");
        String lastWord=word[word.length-1];
        System.out.println( lastWord.length());
    }


}
