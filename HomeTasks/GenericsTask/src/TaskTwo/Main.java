package TaskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 2
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("must be true " + CollectionUtils.containsAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        System.out.println("must be true " + CollectionUtils.containsAny(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        System.out.println("must be false " + CollectionUtils.containsAny(Arrays.asList(1, 2, 3, 4, 5, 6, 7), Arrays.asList(8, 9, 10)));
        System.out.println(CollectionUtils.range(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 1, 7));
    }
}