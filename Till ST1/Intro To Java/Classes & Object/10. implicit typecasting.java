// This is also called type promotion

class Demo{

	void sum(int l, long b){
		System.out.println("Sum is " + (l+b));
	}

	void sum(int l, int b, int h){
		System.out.println("Sum is " + (l+b+h));
	}

	public static void main(String[] args){
		Demo ar = new Demo();
		ar.sum(8, 5); // note : we have passed integer 5 but it will be comverted to long (implicitely) by the function parameter datatype itself, this is called 
	}
}
/*
Output 
Sum is 13

*/
