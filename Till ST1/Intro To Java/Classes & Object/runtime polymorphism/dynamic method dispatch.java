
// runtime polymorphism (dynamic method dispatch)
// reference will be of parent 
// object will be of child always.
// dynamic method dispatch is also known as dynamic binding occur at (run time)
// while static binding means method overloading which occur at (compiler time)

class Game{
    public void type(){
        System.out.println("Indoor & outdoor");
    }
}

public class Cricket extends Game{
    public void type(){
        System.out.println("outdoor game");
    }
    
    public static void main(String[] args){
        Game gm = new Game();
        Cricket ck = new Cricket();
        gm.type();
        ck.type();
        gm = ck;// gm (parent's) reference and ck(child's) object
        gm.type(); // object is still of child, so chil'd method will be given priority first
    }
}

/*

Indoor & outdoor
outdoor game
outdoor game

*/
