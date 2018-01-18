/** 
  OrderedArrayList_String, based on OrderedArrayList v1
  
  a list of String elements, with the invariant the elements
  are in order by increasing value.
 */
import java.util.ArrayList;

public class OrderedArrayList_String  {
    private ArrayList<String> data;

    /** 
      @returns the index of the first occurrence of @findMe
      in this list, or -1 if this list does not contain @findMe.
     */
    public int index(String findMe) {
        return index(findMe, 0, data.size() - 1);
    }
    
    
    /** 
      recursive helper function for index
      
      @returns the index of the first occurrence of @findMe
      in this list, between the indexes @lo and @hi inclusive,
      or -1 if this list does not contain @findMe in that range.
      
      Needs improvement to find the first of repeated values.
     */
    private int index(String findMe, int lo, int hi){
        // base case when @findme is not in list
        if(lo > hi) return -1;
        
        // Check the middle of the range using integer division
        int mid = (lo + hi) / 2;
        int midResult = data.get( mid).compareTo( findMe);
            
        // If midResult is not a match, recursively look for @findMe 
        // in the appropriate partition.
        if( midResult < 0)  // midResult precedes @findMe
             return index( findMe, mid+1, hi);
        else if ( midResult > 0)  // @findMe precedes midResult 
            return index( findMe, lo, mid-1);

        // found a  match
        
        /* Handle finding the first of repeated values. I think this
           requires continuing until lo == mid, like...
               else if( lo != mid) return index( findMe, lo, mid);
            but I'm not testing this now.
         */
        
        else return mid;
            
    }
    
    
   /** 
      helper function for constructor
      @return the index of the lexicographically first of the elements,
              ignoring null elements, and
              using the classic reigning champ algorithm
     */
     private int champIndex( ArrayList<String> challengers) {
        String champ;  // lexicographically earliest seen so far
        champ = "zzzzzzzzzzz";  /* last possible name
           Improvement deemed not worth the complication:
              Init champ to the first non-null value.
              Iterate from there to find the real champ.
           */
        int result = -1;  // will be set to the index of the champ
        for( int testPos = 0; testPos < challengers.size(); testPos++)
            if(    challengers.get( testPos) != null  // not already used
                &&
                   challengers.get( testPos).compareTo( champ) < 0
              ) {
                result = testPos;
                champ = challengers.get( testPos);
              }
        return result;
     }

    private int champIndex(int start, ArrayList<String> challengers) {
        String champ;  // lexicographically earliest seen so far
        champ = "zzzzzzzzzzz";  /* last possible name
           Improvement deemed not worth the complication:
              Init champ to the first non-null value.
              Iterate from there to find the real champ.
           */
        int result = -1;  // will be set to the index of the champ
        for(int testPos = start; testPos < challengers.size(); testPos++)
            if(    challengers.get( testPos) != null  // not already used
                &&
                   challengers.get( testPos).compareTo( champ) < 0
              ) {
                result = testPos;
                champ = challengers.get( testPos);
              }
        return result;
     }

    /** 
      construct order from an unordered ArrayList
     */
    public OrderedArrayList_String(ArrayList<String> unordered) {
        this();
        
        for (int c = 0; c < unordered.size(); c++) {
            int champInd = champIndex(c, unordered);
            String champ = unordered.get(c);
            
            unordered.set(champInd, unordered.get(c));
            unordered.set(c, champ);
        }
        
        data = unordered;
    }
    
    /* -------------------------------------------------------
       methods below here are versions of OrderedArrayList v1
       with minor modification to String type
     */
     
     
    /** 
      construct an empty instance
     */
    public OrderedArrayList_String() {
        data = new ArrayList<String>();
    }

    /** 
      @return a string representation of this OrderedArrayList
     */
    public String toString() {
        return data.toString();
    }

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add( String value) {
         int dest;
         for( // declare dest before loop, since it is needed after the loop
              dest = 0
            ;    dest < data.size() 
              && data.get( dest).compareTo( value) < 0
            ; dest++) ;

         System.out.println( "OAR adding " + value + " at index " + dest);
         data.add( dest, value);
     }

     // pass through methods where possible
    public int size() {
      return data.size();
    }

    public String get( int index) {
      return data.get(index);
    }

    public String remove( int index) {
      return data.remove( index);
    }
}