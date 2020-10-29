package sep_2020.dataStructure;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRU {
    private Set<String> cache;
    private int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.cache =  new LinkedHashSet<>();
    }

    public boolean get(String str){
        if(!cache.contains(str)) {
            return false;
        } else {
            cache.remove(str);
            cache.add(str);
            return true;
        }
    }
    public void referString(String str) {
        if(!get(str)){
            put(str);
        }
    }
    private void put(String str) {
        if( cache.contains(str)) {
            cache.remove(str);
        } else if (cache.size() == capacity){
            String firstElement = cache.iterator().next();
            cache.remove(firstElement);
        }
        cache.add(str);
    }

    // display contents of cache
    public void display() {
        Iterator<String> itr = cache.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        LRU cache = new LRU(4);
        cache.referString("Ferdis");
        cache.referString("Ferdinand");
        cache.referString("Ferdinand");
        cache.display();
    }
}
