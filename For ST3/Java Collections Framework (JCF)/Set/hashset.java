
import java.util.*;

// HASHSET (java) -> unorderd_set (cpp)
// it is unsorted
// stores only distinct values

// .add()
// .size()
// .contains(key) --> returns true if yes

public class Q2 {

    public static void main(String ... args){

        HashSet<String> hs = new HashSet<>();

        // hashmap  - > unordered set (stores only distinct values)

        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        for(int i=0; i < size; i++){
            String word = scn.next();
            hs.add(word);
        }
        System.out.print("No of distinct words : " + hs.size());
    }
}
