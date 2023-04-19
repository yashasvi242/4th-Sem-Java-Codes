public class ST_Employee {
    
    // static block is used to initialize ststic data members,
    // a static block executes even before main method
    
    int eid;
    String name ;
    static String company_name;
    
    static{
        company_name = "My_Anatomy";
        System.out.print("Hi");
        
    }
    public void show(){
        System.out.println(eid + " " + name + " " + company_name);
    }
    
    public static void main(String[] args){
        ST_Employee se1 = new ST_Employee();
        se1.eid = 104;
        se1.name = "Abhijit";
        se1.show();
    }
}

/*
Output : 

Hi104 Abhijit My_Anatomy


*/
