import java.util.*;

class Maps2{

    // LinkedHashMap Extends AbstractMap and implements Map interface 
    // sequential (in this data will display in the order we have inserted it)

    public static void main(String ... args){

        Map<String,Integer> hm = new LinkedHashMap<>();

        hm.put("aniket", 100);
        hm.put("bablu", 200);
        hm.put("dany", 400);
        hm.put("sweta", 600);
        hm.put("nikhil", 500);
        hm.put("chintu", 300);

        Set<Map.Entry<String,Integer>> st = hm.entrySet(); // creating a set from maps data so that we can iterate over the set 

        
        for(Map.Entry<String,Integer> me:st){  // iterating overt the set and printing key-value pairs
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
    }
}
/*
 Output :- 
 
aniket : 100
bablu : 200
dany : 400
sweta : 600
nikhil : 500
chintu : 300

 */
