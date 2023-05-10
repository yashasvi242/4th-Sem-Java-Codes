class MultiThreading{

    public static void main(String ... args){
        
        Thread t = Thread.currentThread();
        t.setName("Main Thread");
        System.out.println(Thread.currentThread().getName()); // lets print the name of this current thread (i.e main)
    }
}

//Output :- 
// Main Thread
