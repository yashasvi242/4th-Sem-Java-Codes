/*
- for Method overloading - when we have different methods with same name then this is called method overloading, for method overloading 
 1. either change number of arguments of 2 same named functions or 
 2. change type of arguments
 3. or change the order of arrangement of parameters.

*/
class Calculate{

	void sum(double a, double b, double c){
		System.out.println("sum is  " + (a+b+c));
	}

	void sum(int a, int b){
		System.out.println("sum is  " + (a+b));
	}

	void sum(float a, float b){
		System.out.println("sum is " + (a+b));
	}

	public static void main(String[] args){
		Calculate cal = new Calculate();
		cal.sum(8,5);
		cal.sum(4.6f, 4.8f) ;// it is imp to add f at the end otherwise it will treat it as int (not float) 
		cal.sum(4.60d, 3.40d, 5.20d); // for double
	}
}
/*
Output 
sum is  13
sum is 9.4
sum is 13.2

*/
