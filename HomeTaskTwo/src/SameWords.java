import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/**
 *   Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
 */

public class SameWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/obiito/c/IdeaProjects/Sber-HomeTask/HomeTaskTwo/src/text.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String, Integer> wordToCount =  new HashMap<>();

        while(scanner.hasNext()){
            String[] words = scanner.nextLine().split(" ");

            for(String word : words){
                if(wordToCount.containsKey(word)){
                    wordToCount.put(word, wordToCount.get(word) + 1);
                }
                else{
                      wordToCount.put(word, 1);
                }
            }
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));

        }
    }
}
