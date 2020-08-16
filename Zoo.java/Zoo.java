class Zoo
{
   static Animal[] animals = {
                    new Tiger("Katya"),new Lion("Jade"),new Giraffe("Hans"),new Gazelle("Peter")
             };
   public static void printSpecies(Animal thisOne)      {
        System.out.println("I am a " + thisOne.getSpecies());
   }
   public static void printName(Animal thisOne) {
        System.out.println("My name is " + thisOne.getName());
   }
   public static void printHomeStatus(Animal thisOne)   {
        System.out.println("I am" + ( thisOne.amIHome() ? " " : " not " ) + "home."  );
        if ( thisOne.amIHome() ) 
                System.out.println(thisOne.areYouHome());
   }


   public static void main(String args[] )      {
        Class[] classes;
        for ( int index = 0; index < animals.length; index ++ ) {
                printSpecies(animals[index]) ;
                printName(animals[index]) ;
                printHomeStatus(animals[index]) ;
                animals[index].goHome();
                printHomeStatus(animals[index]) ;
                // if I am a tiger send me to hunt and ask if I am hungry - implement 1
                // if I am a gazelle send me to graze and ask if I am hungry - implement 2
        }
   }
}