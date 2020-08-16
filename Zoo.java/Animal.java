/**
 * Animal is the class to be extended
 */
public class Animal  {
	  String name;
	  boolean herbivore=false;
	  boolean carnivore=false;
	  public Animal() {
		  
	  }
      public Animal(String aString) {
    	  name=aString;
      }
      
      public String getSpecies(){
    	  return name;
      }
      
      public String getName() {
    	  return "XXX";
      }
      
      public boolean amIHome() {
    	  if(carnivore==false) {
    		  return true;
    	  }else {
    		  return false;
    	  }
      }
      
      public String areYouHome() {
    	  return "XXX";
      }
      
      public void goHome() {
          System.out.println();
      }
}
