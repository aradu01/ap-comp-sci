/**
 * Test SuperArray features for implementing a list.
 */

public class UserOfSuperArray {

    public static void main( String[] args ) {
        // Create a list of diverse elements,
        // using previously-tested code
        System.out.println();
        SuperArray alpha = new SuperArray();

        // String element
        String s = "Gift of the Magi";
        alpha.add( s);

        // numerical elements
        Integer i = 17;    // autobox the int --> Integer
        alpha.add( i);
        Double d = 1.5;  // autobox
        alpha.add( d);

        // Verify alpha's contents
        System.out.println( "alpha's number of elements: " + alpha.size() );
        System.out.println( "alpha: " + alpha);
        System.out.println();
        System.out.println( "-------- end of previously-tested code ---------");

        // Develop incrementally!

        // identity
        System.out.println( "identity is equivalence: "
                          + alpha.equals( alpha));

        // a prefix list, with first element identical
        SuperArray prefix = new SuperArray();
        prefix.add( s);
        System.out.println( "prefix of alpha: " + prefix);
        System.out.println( "prefix is equivalent: " + alpha.equals( prefix));

        /* Invoke the built-in .equals method for each item in
           a pair of lists. Lists that contain
           same-value but non-identical (svbni) elements
           should be shown as equivalent.
        */
        SuperArray svbni = new SuperArray();
        svbni.add( new String(s));
        svbni.add( new Integer( i)); // Construct a newly-allocated Integer
        svbni.add( new Double( d));  // a new Double
        System.out.println( "same-value but non-identical is equivalent: "
                          + alpha.equals( svbni));

        // Strings that match if one ignores upper vs. lower case
        alpha = new SuperArray();
        alpha.add( s);
        SuperArray bravo = new SuperArray();
        bravo.add( s.toLowerCase());
        System.out.println( bravo + " is equivalent: "
                           + alpha.equals( bravo));

        // Doubles within tolerance
        alpha.add( d);
        Double billionthOff = d + 1e-9;
        bravo.add( billionthOff);
        System.out.println(billionthOff + " is equivalent: "
                          + alpha.equals( bravo));

        // Integers should still work
        alpha.add( i);
        bravo.add( new Integer( i)); // Construct a newly-allocated Integer
        System.out.println( "Equal integers are equivalent: "
                           + alpha.equals( bravo));
        alpha.add(new Integer (5));
        bravo.add(new Integer (6));
        System.out.println( "Different integers are equal: "
                           + alpha.equals( bravo));
    }
    
}
