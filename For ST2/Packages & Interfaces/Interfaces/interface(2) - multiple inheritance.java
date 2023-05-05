// achieving multiple inheritance using Interfaces

interface Movable{
    public boolean isMovable();  // even if we remove this public, then also it will work because in the below class, white writing the body of this method, we have alredy used 'public'
}

interface Rollable{
    public boolean isRollable();
}

public class Interface2 implements Movable,Rollable{

    int width;
    public boolean isMovable(){
        return true;
    }
    public boolean isRollable(){
        return true;
    }

    public static void main(String ... args){
        
        Interface2 tr = new Interface2();
        System.out.println(tr.isMovable());
        System.out.println(tr.isRollable());
    }

}

/*
true
true
*/
