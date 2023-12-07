package Hashmap;
import java.util.*;
public class map<K,V> {
    ArrayList<mapnode<K,V>> buckets;
    int size;
    int numbuckets;
    public map(){
        numbuckets = 20;
        buckets = new ArrayList<>();
        for(int i=0;i<20;i++){
            buckets.add(null);
        }
    }

    private int getbucketindex(K key){
        int hashcode = key.hashCode();
        return hashcode% numbuckets;
    }

    public int size(){
        return size;
    }

    public V removekey(K key){
        int bucketindex = getbucketindex(key);
        mapnode<K,V> head = buckets.get(bucketindex);
        mapnode<K,V> prev = null;
        while(head!=null){
            if(head.key.equals(key)){
                if(prev==null){
                    buckets.set(bucketindex, head.next);
                }
                else{
                prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }


    public V getvalue(K key){
        int bucketindex = getbucketindex(key);
        mapnode<K,V> head = buckets.get(bucketindex);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }




    public void insert(K key, V value){
        int bucketindex = getbucketindex(key);
        mapnode<K,V> head = buckets.get(bucketindex);
        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketindex);
        mapnode<K,V> newelementnode = new mapnode<K,V>(key, value);
        newelementnode.next = head;
        buckets.set(bucketindex,newelementnode);
    }





    public static void main(String args[]){

    }

}
