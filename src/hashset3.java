import java.util.HashMap;
import java.util.*;

public class hashset3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,2,4};
        HashMap<Integer,Integer> Map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(Map.containsKey(arr[i])){
                int freq=Map.get(arr[i]);
                Map.put(arr[i],freq+1);

            }else{
                Map.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer,Integer> me:Map.entrySet()){
            System.out.println("Element:"+me.getKey()+"frequency"+me.getValue());
        }
    }
}
