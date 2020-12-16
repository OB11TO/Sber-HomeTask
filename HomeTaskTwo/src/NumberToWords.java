import java.io.*;
import java.util.Scanner;


public class NumberToWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/obiito/c/IdeaProjects/Sber-HomeTask/HomeTaskTwo/src/text.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;
        int lines = 0;

        while (scanner.hasNextLine()) {
            lines++;
            String[] words = scanner.nextLine().split(" ");
            count = count + words.length;
        }
        System.out.println("Колличество слов в файле =  " + count);
        System.out.println("Колличество строк в файле = " + lines);
        scanner.close();
    }
}