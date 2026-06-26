package coreJava;

public class M416Gun {
	private String scope;
	private String mag;
	private int ammos;
	private String target;

    
	public M416Gun(String scope, String mag, int ammos, String target) {
		//super();
		this.scope = scope;
		this.mag = mag;
		this.ammos = ammos;
		this.target = target;
	}
	 


	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public int getAmmos() {
		return ammos;
	}

	public void setAmmos(int ammos) {
		this.ammos = ammos;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	public void setMag(String mag)
	{
		 this.mag=mag;
	}
	
    public String   getMag()
    {
         return mag;
    }
    
     public  void fire()
     {
        if(scopeOn() && mag.equals("On")  && ammos>100 && target.equals("Locked")){
        	System.out.println("Firing... Targrt Destroyed..");
        }
        if(!scopeOn())
        {
            System.out.println("Scope is off");
        }
        if (!mag.equals("On"))
        {
        	System.out.println("Mag is empty");
        }
        if(ammos<100)
        {
        	System.out.println("Ammos lessnumbered");
        }
        if(!target.equals("Locked"));
        {
        	System.out.println("Targert is not locked");
        }
     }
    private boolean scopeOn() {
    	if(scope.equals("On"))
    	{
    		return true;
    	}
        return false;



    }



}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     