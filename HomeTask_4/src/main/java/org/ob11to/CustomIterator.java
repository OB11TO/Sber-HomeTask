package org.ob11to;

import java.util.Iterator;

public class CustomIterator implements Iterator<Object> {
    private final Object[] arr;
    private int id;

    public CustomIterator(Object[] arr){
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return id < arr.length;
    }

    @Override
    public Object next() {
        return arr[id++];
    }
}
