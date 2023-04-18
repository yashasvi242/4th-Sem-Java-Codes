class Add{
    int x,y;
    Add(int i, int j){
        x = i;
        y = j;
    }
}

public class Demo {

    public static void main(String[] args){

        Add obj = new Add(5,10);
        // call by value 
        change(obj);
        System.out.println("x = " + obj.x);
        System.out.println("x = " + obj.y);
    }

    public static void change(Add new_obj){ 
        new_obj.x++;
        new_obj.y++;
    }

    
}

/* Output : 
x = 6
x = 11

*/
