public class UserOfCoin {

    public static void main( String[] args ) {
        System.out.println();
        
        // coins for testing
        Coin bruce = new Coin( new String( "quarter"), 0.3 );
        System.out.println("bruce: " + bruce);
        Coin wayne = new Coin( new String("nickel"), 0.7);
        System.out.println("wayne: " + wayne);
        
        // same upFace => equality, even when values differ
        System.out.println( bruce.compareTo( wayne) 
                          + " expecting 0");
        checkConsistency( bruce, wayne);
        
        // identity => equality
        System.out.println( bruce.compareTo( bruce) 
                          + " expecting 0");
        checkConsistency( bruce, bruce);

        // results when upFaces differ
        bruce.setUpFace( new String("heads"));
        System.out.println( bruce.compareTo( wayne) 
                          + " expecting positive");
        checkConsistency( bruce, wayne);
        System.out.println( wayne.compareTo( bruce) 
                          + " expecting negative");
        checkConsistency( wayne, bruce);
        
        // exceptions are thrown for programming errors
        bruce.compareTo( null);
        bruce.compareTo( new String("reference to a non-Coin object"));
        }
    
    /** 
      Check for consistency between .compareTo and .equals
     */
     private static void checkConsistency( Coin c0, Coin c1) {
        if(    c0.compareTo( c1) == 0
            != 
               c0.equals( c1)
          ) {
                System.out.println( "trouble: inconsistency between "
                                  + ".compareTo and .equals");
                System.out.println( c0);                  
                System.out.println( c1);                  
            }
     }

}