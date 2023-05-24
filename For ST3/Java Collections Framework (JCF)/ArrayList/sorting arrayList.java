import java.util.*;

public class ArrayList4 {

    public static void main(String ... args){

        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(2);
        al.add(66);
        al.add(22);
        al.add(10);

        
        System.out.println(al);

        Collections.sort(al);

        System.out.println("Asc sorted array : ");
        System.out.println(al);

        Collections.sort(al, Collections.reverseOrder());

        System.out.println("Des sorted array : ");
        System.out.println(al);


    }
    
}

// [100, 2, 66, 22, 10]
// Asc sorted array :
// [2, 10, 22, 66, 100]
// Des sorted array :
// [100, 66, 22, 10, 2]
