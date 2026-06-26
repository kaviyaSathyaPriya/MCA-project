//comments
package coreJava;

public class Main {
	public static void main(String[]args) {
		
		Convention obj = new Tamilnadu();
		
		System.out.println("Tamilnadu : ");
		
		System.out.println(obj.capital());
		System.out.println(obj.language());
		
		obj = new Karnataka();
		
		System.out.println("Karnataka : ");
		
		System.out.println(obj.capital());
		System.out.println(obj.language());
		
		obj = new Kerala();
		
		System.out.println("Kerala : ");
		
		System.out.println(obj.capital());
		System.out.println(obj.language());
		
		
		
	}

}
