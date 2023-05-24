
import java.util.*;
public class Demo3 {

    public static void main(String ... args){

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(8);
        nums.add(2);
        nums.add(23);

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i < 10)
                it.remove();
        }
        
        System.out.println(nums);
    }
    

    
}

// Output : 
// [12, 23]
