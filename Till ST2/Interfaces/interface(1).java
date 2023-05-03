
interface Moveable{
    int AVG_SPEED = 40;
    void move(); // implicitely (by default) every method inside a interface is private and abstract, so to use it, make sure whereever u define its body, use 'public' there
}

class Interface1 implements Moveable{

    public void move(){  // note : if we remove this public, then it will be a private, abstract method (as taught above)
        System.out.println("Average speed is " + AVG_SPEED);
    }

    public static void main(String ... args){
        Interface1 vc = new Interface1();
        vc.move();
    }
} 
/*
 Average speed is 40
 
 */
