
public class Giraffe extends Animal {
	public Giraffe(String aString) {
		 name=aString;
    }
	
	public String getSpecies(){
		 return name;
    }
    
    public String getName() {
    	return "Hans";
    }
    
    public boolean amIHome() {
    	if(herbivore) {
    		  return true;
    	  }else {
    		  return false;
    	  }
    }
    
    public String areYouHome() {
    	return "I am on the grassland";
    }
    
    public void goHome() {
    	herbivore=true;
    }
}
