import java.util.*;

class Maps{

    // HashMap Extends AbstractMap and implements Map interface 
    // it is non sequential (data can print in any order)

    public static void main(String ... args){

        Map<String,Integer> hm = new HashMap<>();

        hm.put("aniket", 100);
        hm.put("bablu", 200);
        hm.put("chintu", 300);
        hm.put("dany", 400);
        hm.put("nikhil", 500);
        hm.put("sweta", 600);

        Set<Map.Entry<String,Integer>> st = hm.entrySet(); // creating a set from maps data so that we can iterate over the set 

        
        for(Map.Entry<String,Integer> me:st){  // iterating overt the set and printing key-value pairs
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
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
