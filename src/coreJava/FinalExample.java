package coreJava;

public class FinalExample {
	int n;
	
	public FinalExample()
	{
		n=12;
	}
     
	public FinalExample(int n) {
		this.n=n;
	}
	
	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		System.out.println("The value of n : "+fe.getN());
		fe.setN(10);
		System.out.println("The value of n : "+fe.getN());


	}

}
