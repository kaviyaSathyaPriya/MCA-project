package coreJava;

public class ThrowAndThrows {

	public static void main(String[] args) {
		try {
			System.out.println(checkString("Hi "));
	        System.out.println("String are equal");
		} catch (Exception e) {
		   System.out.println("String are not equal") ;
		}

	}
   
	public static boolean checkString(String str) throws Exception
	{
		
	if(str.equals("Hello"))
		{
	        return true;
		}
	    throw new Exception();
   }
}