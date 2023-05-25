// VECTORS 
// similar to ArrayList
// it is thread safe (unlike arrayList)

import java.util.*;
public class Vectors {
    

    public static void main(String[] args){
        Vector<Integer> v1 = new Vector<>();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.addElement(40);// same as .add()
        v1.addElement(9);
        v1.addElement(8);
        v1.addElement(7);

        System.out.println(v1);

        for(int i=0; i < v1.size(); i++){
            System.out.print(v1.get(i) + " | ");
        }


    }
}


// [10, 20, 30, 40, 9, 8, 7]
// 10 | 20 | 30 | 40 | 9 | 8 | 7 |
