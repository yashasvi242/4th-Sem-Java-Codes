import java.util.*;

class Maps3{

    // LinkedHashMap Extends AbstractMap and implements Map interface 
    // sequential (in this data will display in sorted manner(ascending order of key (i.e lexographically)) )
    // lexographical means on basis of asci A < a 
  //  equivalent to ordered maps of cpp

    public static void main(String ... args){

        Map<String,Integer> hm = new TreeMap<>();

        hm.put("aniket", 100);
        hm.put("bablu", 200);
        hm.put("dany", 400);
        hm.put("sweta", 600);
        hm.put("nikhil", 500);
        hm.put("chintu", 300);
        hm.put("yashasvi", -100);

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
chintu : 300
dany : 400
nikhil : 500
sweta : 600
yashasvi : -100

 */
