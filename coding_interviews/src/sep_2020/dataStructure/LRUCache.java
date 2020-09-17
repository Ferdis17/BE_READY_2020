package sep_2020.dataStructure;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

   private Deque<Integer> doublyQueue;

   private HashSet<Integer> hashSetKey;

   private final int MAX_CACHE_SIZE;

   public LRUCache(int cacheSize){
       MAX_CACHE_SIZE = cacheSize;
       doublyQueue = new LinkedList<>();
       hashSetKey =  new HashSet<>();
   }

   // refer the page in the set, in other words search the page
    public void referPage(int page){
       if(!hashSetKey.contains(page)) {
           if (doublyQueue.size() == MAX_CACHE_SIZE) {
               int last = doublyQueue.removeLast();
               hashSetKey.remove(last);
           }
       } else {
           doublyQueue.remove(page);
       }
       doublyQueue.push(page);
       hashSetKey.add(page);
    }

    // display the content of the cache
    public void displayContent() {
        Iterator<Integer> it = doublyQueue.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
       LRUCache cache = new LRUCache(5);
        cache.referPage(5);
        cache.referPage(2);
        cache.referPage(2);
        cache.referPage(1);
        cache.referPage(1);
        cache.referPage(4);
        cache.referPage(6);
        cache.displayContent();
    }
}
