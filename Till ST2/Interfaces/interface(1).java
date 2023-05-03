
interface Moveable{
    int AVG_SPEED = 40;
    void move();
}

class Interface1 implements Moveable{

    public void move(){
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
