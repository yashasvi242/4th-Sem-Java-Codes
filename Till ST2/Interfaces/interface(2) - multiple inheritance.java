// achieving multiple inheritance using Interfaces

interface Movable{
    public boolean isMovable();
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
