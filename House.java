




public class House {
	
	 private String address;
	 private String type;
	 private String owner;
	 private double value;
	 
	 
	   public House() {
	   	   
	   	     address = "No address Specified";
	   	     type = "No type specified";
	   	     owner = "No Owner specified";
	   	     value = 0.0f;
	   }
	   
	    public House(String address,String owner,String type, double value)
	    {
	    	this.address = address;
	    	this.owner = owner;
	    	this.type = type;
	    	this.value = value;
	    }
	    
	    public void setAddress(String address)
	    {
	    	this.address = address;
	    }
	    public void setOwner(String owner)
	    {
	    	this.owner = owner;
	    }
	    public void setType(String type)
	    {
	    	this.type = type;
	    }
	    public void setValue(Double value)
	    {
	    	this.value = value;
	    }
	    public String getAddress()
	    {
	    	return address;
	    }
	    public String getOwner()
	    {
	    	return owner;
	    }
	    public String getType()
	    {
	    	return type;
	    }
	    public double getValue()
	    {
	    	return value;
	    }
	    
	    public String toString () {
	    	
	    	return  getAddress() + getOwner() + getType() + getValue();
	    }
	    
}