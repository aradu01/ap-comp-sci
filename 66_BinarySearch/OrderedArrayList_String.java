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
            if (lower == index) {
                return -1;
            }

            else if (value.compareTo(arrayList.get(index)) < 0) {
                upper = index;
                index = (upper + lower) / 2;
            }

            else if (value.compareTo(arrayList.get(index)) > 0) {
                lower = index;
                index = (lower + upper) / 2;
            }

            else {
                System.out.println("ERROR IN CODE");
            }
        }
        
        return index;    
    }
    
    
<<<<<<< HEAD
   /** 
      helper function for constructor
      @return the index of the lexicographically first of the elements,
              ignoring null elements, and
              using the classic reigning champ algorithm
     */
     private int champIndex(ArrayList<String> challengers) {
         String champ = "zzzzzzzzzz";
         int place = -1;
         for (int a = 0; a < challengers.size(); a++) {
             if (challengers.get(a) != null && (challengers.get(a)).compareTo(champ) > 0) {
                 champ = challengers.get(a);
                 place = a;
             }
         }
         return place;
     }


    /** 
      construct order from an unordered ArrayList
     */
=======
    /** 
	helper function for constructor
	@return the index of the lexicographically first of the elements,
	ignoring null elements, and
	using the classic reigning champ algorithm
    */
    private int champIndex(ArrayList<String> challengers) {
	String champ = "zzzzzzzzzz";
	int place = -1;

	for (int a = 0; a < challengers.size(); a++) {
	    if (challengers.get(a) != null && (challengers.get(a)).compareTo(champ) < 0) {
		champ = challengers.get(a);
		place = a;
	    }
	}
	
	champ = "zzzzzzzzzz";
	return place;
    }


    /** 
	construct order from an unordered ArrayList
    */
>>>>>>> 80d8ebb3701945087f1d3ad2c87416c337738387
    public OrderedArrayList_String(ArrayList<String> unordered) {
        ArrayList<String> data = new ArrayList<String>();

        for (int b = 0; b < unordered.size(); b++) {
            data.add(unordered.get(champIndex(unordered)));
<<<<<<< HEAD
            unordered.remove(get(champIndex(unordered)));
=======
            unordered.remove(champIndex(unordered));
>>>>>>> 80d8ebb3701945087f1d3ad2c87416c337738387
        }
        
        arrayList = data;
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
<<<<<<< HEAD
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public void add(String value) {
         int dest;
         for(dest = 0; dest < arrayList.size() && arrayList.get( dest).compareTo( value) < 0; dest++) ;

         System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }

     // pass through methods where possible
=======
	Put @value where it belongs in the list.
	@pre: the list is in increasing order
    */
    public void add(String value) {
	int dest;
	for(dest = 0; dest < arrayList.size() && arrayList.get( dest).compareTo( value) < 0; dest++);

	System.out.println( "OAR adding " + value + " at index " + dest);
	arrayList.add( dest, value);
    }

    // pass through methods where possible
>>>>>>> 80d8ebb3701945087f1d3ad2c87416c337738387
    public int size() {
	return arrayList.size();
    }

    public String get(int index) {
<<<<<<< HEAD
      return arrayList.get(index);
    }

    public String remove(int index) {
      return arrayList.remove( index);
=======
	return arrayList.get(index);
    }

    public String remove(int index) {
	return arrayList.remove( index);
>>>>>>> 80d8ebb3701945087f1d3ad2c87416c337738387
    }

}
