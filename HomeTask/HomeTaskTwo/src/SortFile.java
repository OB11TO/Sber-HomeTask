import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *  Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
 *  (компаратор сначала по длине слова, потом по тексту).
 */

public class SortFile {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> map = new HashMap<>();
        VComparator comparator = new VComparator(map);
        TreeMap<String, Integer> sortMap = new TreeMap<>(comparator);

        File file = new File("/home/obiito/c/IdeaProjects/Sber-HomeTask/HomeTaskTwo/src/text.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            String[] words = scanner.nextLine().split(" ");

            for(String word : words){
                if(map.containsKey(word)){
                    map.put(word, map.get(word) + 1);
                }
                else{
                    map.put(word, 1);
                }
            }
        }
        sortMap.putAll(map);
        System.out.println("Сортировка : " + sortMap);

    }
}


    class VComparator implements Comparator<String> {
        Map<String, Integer> map;

        public VComparator(Map<String, Integer> map) {
            this.map = map;
        }

        public int compare(String s, String t1) {
            if(s.length() <= t1.length()){
                return -1;
            }else{
                return 1;
            }
        }
    }


