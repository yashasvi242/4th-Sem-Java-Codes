import java.util.*;

class Maps{

    // HashMap Extends AbstractMap and implements Map interface 
    // it is non sequential (data can print in any order)
    /* imp functions 
        - map.get(key)    returns value 
        - map.size()
        - map.isEmpty()
        - map.containsKey(key)    returns boolean (i.e somewhat alternative of map.find() of cpp) 
        - map.put(key, value)
        - map2.putAll(map1)
        - map.remove(key)
        - map.clear()
        - map.containsValue(value)    returns boolean
        

    */
    public static void main(String ... args){

        Map<String,Integer> hm = new HashMap<>();

        hm.put("aniket", 100);
        hm.put("bablu", 200);
        hm.put("chintu", 300); // inserting value into a map
        hm.put("dany", 400);
        hm.put("nikhil", 500);
        hm.put("sweta", 600);

        Set<Map.Entry<String,Integer>> st = hm.entrySet(); // creating a set from maps data so that we can iterate over the set 
        
        // method -1 (using set)
        for(Map.Entry<String,Integer> me:st){  // iterating overt the set and printing key-value pairs 
            System.out.print(me.getKey() + " : ");    
            System.out.println(me.getValue());
        }
        
        // method -2 (without using set)
        
        for(String key:hm.keySet()){
            int value = hm.get(key);
            System.out.print(key + " : " + value);
        }

        */
    }
}
/*
 Output :- 

chintu : 300
sweta : 600
nikhil : 500
dany : 400
aniket : 100
bablu : 200

 */
