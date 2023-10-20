package LinkedList;
import java.util.*;

public class CreateLL {
    
    public static void main(String ... args){

        Scanner scn = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        int n = scn.nextInt();

        for(int i=0; i < n; i++){
            int ele = scn.nextInt();
            ll.push(ele);
        }

        // print 
        System.out.println(ll);
    }

}
