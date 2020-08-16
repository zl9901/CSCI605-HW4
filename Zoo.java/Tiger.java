
public class Tiger extends Animal {
	public Tiger(String aString) {
  	  name=aString;
    }
    
    public String getSpecies(){
  	  return name;
    }
    
    public String getName() {
    	return "Katya";
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
