import java.io.*;
import java.util.Stack;

/**
 *     Задание 4: Выведите на экран все строки файла в обратном порядке.
 */

public class ReverseFile {
    public static void main(String[] args) throws IOException {
        //BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader("/home/obiito/c/IdeaProjects/Sber-HomeTask/HomeTaskTwo/src/text.txt"));
            String str;
            while ((str = fileReader.readLine()) != null) {
                reverseString(str);
            }
        }

    public static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}
