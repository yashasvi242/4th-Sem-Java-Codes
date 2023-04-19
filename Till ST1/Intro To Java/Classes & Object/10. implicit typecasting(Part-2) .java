// This is also called type promotion

class Demo{

	void sum(int l, long b){ 
		System.out.println("Sum is " + (l+b));
		System.out.println("long fun called");
	}

	void sum(int l, int b){  // this was called
		System.out.println("Sum is " + (l+b));		
		System.out.println("int fun called");
	}


	void sum(int l, int b, int h){  
		System.out.println("Sum is " + (l+b+h));
	}

	public static void main(String[] args){
		Demo ar = new Demo();
		ar.sum(8, 5); // note : now since 8 and 5 are int and out class already has fun with 2 integers, then the fun(int,long) will not be called because compiler will give priority to fun(int,int) rather then the 'int' 'long'
	}
}

/*  Output :- 

Sum is 13
int fun called

*/
