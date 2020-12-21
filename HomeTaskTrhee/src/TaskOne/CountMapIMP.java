package TaskOne;

import java.util.HashMap;
import java.util.Map;

public class CountMapIMP<T> implements CountMap<T> {
    private Map<T, Integer> map = new HashMap<>();


    @Override
    public void add(T o) {
        int count=getCount(o);
        map.put(o, ++count);
    }


    @Override
    public int getCount(Object o) {
        Integer count=map.get(o);
        if(count!=null){
            return count;
        }
        return 0;

    }

    @Override
    public int remove(Object o) {
        Integer count=map.remove(o);
        if(count!=null){
            return count;
        }
        return 0;

    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> src=source.toMap();
        for(T key: src.keySet()){
            int count=src.get(key);
            count+=getCount(key);
            map.put(key, count);
        }

    }

    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        for (T key : map.keySet()) {
            Integer count = map.get(key);
            if (destination.containsKey(key)) {
                count += destination.get(key);
            }
            destination.put(key, count);
        }
    }
}