package sep_2020.dataStructure;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache2 {
    private Set<Integer> cache;
    private int capacity;

    public LRUCache2(int capacity) {
        this.cache = new LinkedHashSet<>(capacity);
        this.capacity = capacity;
    }

    private boolean get(int key) {
        if(!cache.contains(key)){
            return false;
        } else {
            cache.remove(key);
            cache.add(key);
            return true;
        }
    }

    public void referPage(int key) {
        if (!get(key)) {
            put(key);
        }
    }

    private void put(int key) {
        if(cache.contains(key)) {
            cache.remove(key);
        } else if(cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }
    // display contents of cache
    public void display() {
        Iterator<Integer> itr = cache.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(4);
        cache.referPage(6);
        cache.referPage(1);
        cache.referPage(2);
        cache.referPage(3);
        cache.referPage(4);
        cache.referPage(5);
        cache.referPage(1);
        cache.referPage(6);
        cache.display();
    }
}
