
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word:");
        String word = reader.nextLine();
        while(!(words.contains(word))){
            words.add(word);
            System.out.print("Type a word:");
            word = reader.nextLine();
            
        }
        if (word.contains(word)){
           System.out.print("You gave twice the word "+ word);
        }
    }
}
