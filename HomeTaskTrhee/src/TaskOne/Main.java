package TaskOne;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map1 = new CountMapIMP<>();

        map1.add(10);
        map1.add(10);
        map1.add(5);
        map1.add(6);
        map1.add(5);
        map1.add(10);

        System.out.println("map1");
        System.out.println(map1.getCount(5)); // 2
        System.out.println(map1.getCount(6)); // 1
        System.out.println(map1.getCount(10)); // 3

        CountMap<Integer> map2 = new CountMapIMP<>();

        map2.add(5);
        map2.add(6);
        map2.add(10);

        map2.addAll(map1);
        System.out.println("map2 (map2.addAll(map1))");
        System.out.println(map2.getCount(5)); // 3
        System.out.println(map2.getCount(6)); // 2
        System.out.println(map2.getCount(10)); // 4

        CountMap<Integer> map3 = new CountMapIMP<>();

        map3.add(5);
        map3.add(6);
        map3.add(10);

        map2.toMap(map3.toMap());
        System.out.println("map3 (map2.toMap(map3.toMap()))");
        System.out.println(map3.getCount(5)); // 4
        System.out.println(map3.getCount(6)); // 3
        System.out.println(map3.getCount(10)); // 5

    }
}