package Hashmap;
import java.util.*;
import java.util.HashMap;
public class removedublicate {
    public static ArrayList<Integer> remove(int a[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(seen.containsKey(a[i])){
                continue;
            }
            output.add(a[i]);
            seen.put(a[i], true);
        }
        return output;
    }
    public static void main(String[] args){
        int a[] = {1,2,53,2,3};
        ArrayList<Integer> output = remove(a);
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i));
        }
    }
}
