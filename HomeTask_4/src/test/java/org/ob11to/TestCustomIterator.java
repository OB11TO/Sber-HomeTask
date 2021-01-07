package org.ob11to;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCustomIterator {

    @Test
    void TestIteratorArrayObjects(){
        String[] arr = {"one", "two", "three"};
        CustomIterator customIterator = new CustomIterator(arr);

        int id = 0;

        while (customIterator.hasNext()){
            assertEquals(arr[id++], customIterator.next());
        }

        assertFalse(false);
    }

}