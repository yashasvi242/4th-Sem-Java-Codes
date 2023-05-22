// generic contructor 

class Gen {

    private double val;
    <T extends Number> Gen(T obj){
        val = obj.doubleValue();
    }

    void show(){
        System.out.println(val);
    }
    
}

class Demo5{
    public static void main(String ...args){
        Gen g = new Gen(100);
        Gen g1 = new Gen(121.5f);
        g.show();
        g1.show();
    }
}

// Output : 
// 100.0
// 121.5
