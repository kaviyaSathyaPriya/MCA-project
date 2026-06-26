package coreJava;

public class ScopeOfVariables {
	
	static int k = 10; //global variable or Instance variable
	
	
	//ithuvum oru method 
	public static void main(String[] args) {
		
		int a=7, b=6; //local variables
		sum(a,b);
		sub(a,b);
		
	}
	
	//addition pandrom
	public static void sum(int g, int h) { //Parameter scope (both Local variable scope and parameter variable scope are similar)
		
		int c ; //local variable
		c = g+h; 
		
		System.out.println(k);
	}
	
	//Subtraction pandrom
	public static void sub(int i, int j) {
		
		int d; //local variable
		d = i-j;
		
		System.out.println(d);
		
		if(d ==1 ) {
			int pranavi = 99; //Block level variable
			System.out.println(pranavi);
		}
		
		//System.out.println(pranavi);
			
	}// method end
	

}
