package coreJava;

public class LocalVariable {

	public static void main(String[] args) {
		int a=6; //local variables
		int b=9;
		System.out.println(a+b);
	}
		
		//addition 
		public static void sum(int d,int e) { //Parameter scope 
			
			int c ; //local variable
			c = d+e; 
			
			System.out.println(c);

	}

}
