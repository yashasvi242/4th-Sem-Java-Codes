class New{

	public static void main(String[] args){

		double d = 100;
		float f = (float)d;
		long L = (long)f;
		int i = (int)L;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println(d);
		System.out.println(f);
		System.out.println(L);
		System.out.println(i);
		System.out.println(s);
		
		System.out.printf("%.2f\n",d);  // if we want to print till 2 decimal places
		


	}

	

}
// output : 
/*

100.0
100.0
100
100
100
100.00 

*/
