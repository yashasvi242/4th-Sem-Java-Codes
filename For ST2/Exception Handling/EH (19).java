class ItemNotFound extends Exception{

    public ItemNotFound(String s){
        super(s);
    }
}

class New{
    static void find(int arr[], int item) throws ItemNotFound{
        
        boolean flag = false;
        for(int i=0; i < arr.length; i++){
            if(item == arr[i]){
                flag = true;
            }
        }
        if(!flag){
            throw new ItemNotFound(""+item+""); // this way item(int) will be comverted to string 
        }
        else{
            System.out.println("Item Found");
        }
    }

    public static void main(String ... args){
        try{
            find(new int[]{12,25,45}, 10);
        }
        catch(ItemNotFound i){
            System.out.println(i);
        }
    }
}

// ItemNotFound: 10

// note : in this the 'ItemNotFound' is class name and it is printed because we did not overwrite the toString function, so by default the original 'Exception's to string is printed, in which 'getName()' method is defined,
// which will print the 'class Name' by default first, and then the content of the string 


 
