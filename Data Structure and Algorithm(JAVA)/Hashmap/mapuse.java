package Hashmap;
import java.util.HashMap;
public class mapuse {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("def",2);
        if(map.containsKey("abc")){
            System.out.println("contains abc");
        }
        if(map.containsKey("abc1")){
System.out.println("conatons abc1 ");
        }
        int val = map.get("abc");
        System.out.println(val);
        //int v = map.get("abc1");
        //System.out.println(v);
       // int s = map.remove("def");
       // System.out.println(s
        System.out.println(map.size());
    }
}
