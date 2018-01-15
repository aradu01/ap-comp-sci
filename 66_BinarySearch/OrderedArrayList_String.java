/** 
  OrderedArrayList_String, based on OrderedArrayList v1
  
  a list of String elements, with the invariant the elements
  are in order by increasing value.
 */
import java.util.ArrayList;

public class OrderedArrayList_String  {
    private ArrayList<String> arrayList;

    /** 
      @returns the index of the first occurrence of @findMe
      in this list, or -1 if this list does not contain @findMe.
     */
    public int index(Object findMe) {

        String value = (String) findMe;
        int lower = 0;
        int index = arrayList.size() / 2;
        int upper = arrayList.size();

        while (arrayList.get(index) != value) {
            if (value.compareTo(arrayList.get(index)) < 0) {
                index = upper - index / 2;
                upper = index;
            }

            else if (value.compareTo(arrayList.get(index)) > 0) {
                index = lower + (upper - index) / 2;
                lower = index;
            }

            else {
                System.out.println("The object is nonexistant.");
            }
        }
        
        return index;
        
    }
    
    
   /** 
      helper function for constructor
      @return the index of the lexicographically first of the elements,
              ignoring null elements, and
              using the classic reigning champ algorithm
     */
     private int champIndex( ArrayList<String> challengers) {
        return challengers.size() - 1;  // placeholder, awaiting replacement
     }


    /** 
      construct order from an unordered ArrayList
     */
    public OrderedArrayList_String( ArrayList<String> unordered) {
        this();  // placeholder, awaiting replacement

        // for incremental development: test champIndex
        int nextLargerAt = champIndex( unordered);
        System.out.println( "earliest name is at index " + nextLargerAt 
                          + " and has the value " + unordered.get( nextLargerAt));
    }
    
    /* -------------------------------------------------------
       methods below here are versions of OrderedArrayList v1
       with minor modification to String type
     */
     
     
    /** 
      construct an empty instance
     */
    public OrderedArrayList_String() {
        arrayList = new ArrayList<String>();
    }

    /** 
      @return a string representation of this OrderedArrayList
     */
    public String toString() {
        return arrayList.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( String value) {
         int dest;
         for( // declare dest before loop, since it is needed after the loop
              dest = 0
            ;    dest < arrayList.size() 
              && arrayList.get( dest).compareTo( value) < 0
            ; dest++) ;

         System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }

     // pass through methods where possible
    public int size() {
      return arrayList.size();
    }

    public String get( int index) {
      return arrayList.get(index);
    }

    public String remove( int index) {
      return arrayList.remove( index);
    }
}