/**
  test the binary search in OrderedArrayList_String
*/
import java.util.ArrayList;

public class UserOfBinarySearch {
    public static void main(String[] commandLine) {
        System.out.println();
        
        /* make a list of people whose phone numbers we know, 
           in non-lexicographic order (as a a test of 
           OrderedArrayList_String.add)
         */
        ArrayList<String> knowns = new ArrayList<String>();
        knowns.add( "Miller, Glenn");
        knowns.add( "al-Khwarizmi, Muhammad ibn Musa");
        knowns.add( "Archimedes");
        knowns.add( "von Neumann, John");
        knowns.add( "Brubeck, Dave");
        knowns.add( "Hopper, Grace");
        knowns.add( "Contreras, Eric");
        knowns.add( "Costello, Lou");
        knowns.add( "Kernighan, Brian");
        knowns.add( "Jepsen, Carly Rae");
        
        
        // make a phone book
        OrderedArrayList_String phoneBook = new OrderedArrayList_String();
        
        // add people to phone book
        for( String k : knowns) phoneBook.add( k);   
        System.out.println( phoneBook);
        System.out.println();

        // look up people who are in phone book
        String findMe;  // name of person to find
        int foundAt;    // index where person is found
        for( int i = 0; i < phoneBook.size(); i++) {
            findMe = phoneBook.get( i);
            foundAt = phoneBook.index( findMe);
            System.out.println( findMe  + " at index " + foundAt
                              + "   Ok? " + (i == foundAt));
        }
        System.out.println();
        
        // look for people who are NOT in the phone book
                                               // Would be at position...
        String[] unknowns = { "Noman",         // somewhere in the interior
                              "AAAA Plumbing", // before the first entry
                              "zz top",        // after the last entry
        };
        for( String u : unknowns)
            System.out.println( "fail to find " + u 
                              + ", returning " + phoneBook.index( u)
                              );
        System.out.println();


        // test new constructor
        OrderedArrayList_String sorted =
          new OrderedArrayList_String( knowns);
        System.out.println( sorted);
    }
}