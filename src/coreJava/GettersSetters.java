package coreJava;

public class GettersSetters {
	public static void main (String [] args) {
		M416Gun m416 = new M416Gun("On","On",150,"Locked");
		
		m416.fire();
		m416=  new  M416Gun("off","On",150,"Locked");
		m416.fire();
		m416.setScope("On");
		m416.fire();   
	}

}
