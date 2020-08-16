/**
 * Gaelle is the class which extends from Animal
 */
public class Gazelle extends Animal {
	public Gazelle(String aString){
		 name=aString;
	}
	/**
	 * return the type of species
	 */
	public String getSpecies(){
		 return name;
    }
    /**
     * return the name of different animals
     */
    public String getName() {
    	herbivore=false;
    	return "Peter";
    }
    /**
     * to make sure whether the animal is home or outside
     */
    public boolean amIHome() {
    	if(herbivore) {
  		  return true;
  	  }else {
  		  return false;
  	  }
    }
    /**
     * to print the status of animal when they are home
     */
    public String areYouHome() {
    	return  "I am on the grassland";
    }
    /**
     * let the animals go home
     */
    public void goHome() {
           herbivore=true;
    }
}
