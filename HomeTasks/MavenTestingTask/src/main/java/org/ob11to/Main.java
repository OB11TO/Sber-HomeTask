package org.ob11to;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three"};
        CustomIterator customIterator = new CustomIterator(arr);

        while (customIterator.hasNext()){
            System.out.println(customIterator.next());
        }

    }
}
