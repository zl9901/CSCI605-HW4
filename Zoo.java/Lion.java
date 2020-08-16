
public class Lion extends Animal {
	public Lion(String aString) {
		name=aString;
    }
    
    public String getSpecies(){
    	 return name;
    }
    
    public String getName() {
    	carnivore=false;
    	return "Jade";
    }
    
    public boolean amIHome() {
    	if(carnivore) {
    		  return true;
    	  }else {
    		  return false;
    	  }
    }
    
    public String areYouHome() {
    	return "I am in my den";
    }
    
    public void goHome() {
    	carnivore=true;
    }
}
