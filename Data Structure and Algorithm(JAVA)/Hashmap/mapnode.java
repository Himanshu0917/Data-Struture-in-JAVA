package Hashmap;

public class mapnode<K,V> {
    K key;
    V value;
    mapnode<K,V> next;
    public mapnode(K key, V value){
        this.key = key;
        this.value = value;
    }
}
