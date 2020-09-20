package sep_2020.dataStructure;

import java.util.HashMap;

public class LRUWithLinkedListAndHashMap {

   private Node head;
   private Node tail;
   private HashMap<Integer, Node> cache;
   private int cacheCapacity;

   public LRUWithLinkedListAndHashMap(int cacheCapacity){
       this.cacheCapacity = cacheCapacity;
       this.cache = new HashMap<>();
   }

   // getting the value of the node from cache

    public int get(int key){
       if(cache.get(key) == null){
           return 0;
       }
       // in case cache has the element, we get the element using key
       Node t = cache.get(key);
       removeNode(t);
       addNode(t);
       return t.value;
    }

    public void put(int key, int value){
       if(cache.containsKey(key)){
           Node t = cache.get(key);
           value = t.value;

           removeNode(t);
           addNode(t);
       } else {
           if(cache.size() == cacheCapacity){
               // remove element first element
               cache.remove(head.key);
               removeNode(head);
           }
           // add new node
           Node n = new Node(key, value);
           addNode(n);
           cache.put(key, n);
       }

    }
    private void addNode(Node t) {
       if(tail != null){
           tail.next = t;
       }
       t.prev = tail;
       t.next = null;
       tail = t;

       if(head == null){
           head = tail;
       }
    }
    private void removeNode(Node t) {
        if(t.prev != null){
            t.prev.next = t.next;
        } else {
            head = t.next;
        }
        if(t.next != null) {
            t.next.prev = t.prev;
        } else {
            tail = t.prev;
        }
    }

    // creating a Node class aka element of the cache
    static class Node{
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LRUWithLinkedListAndHashMap lruWithLinkedListAndHashMap = new LRUWithLinkedListAndHashMap(4);
        lruWithLinkedListAndHashMap.put(1, 4);
        lruWithLinkedListAndHashMap.put(2, 5);
        lruWithLinkedListAndHashMap.put(3, 2);
        lruWithLinkedListAndHashMap.put(4, 6);
        lruWithLinkedListAndHashMap.put(5, 4);
        lruWithLinkedListAndHashMap.put(1, 7);
        lruWithLinkedListAndHashMap.put(2, 5);
        lruWithLinkedListAndHashMap.put(0, 5);
        lruWithLinkedListAndHashMap.put(7, 6);
        HashMap<Integer, Node> cache = lruWithLinkedListAndHashMap.cache;
        cache.forEach((key, value) -> System.out.println(key + " " + value.value));
    }
}
