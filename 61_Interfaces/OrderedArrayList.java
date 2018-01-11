/*  
    is-A:   newClass is-A-kind-of existingClass
      >> Inheritance, subclass.
      Use it when you are working with polymorphism.  A subclass is-A superclass.  You would utilize is-A when you are working with separate classes.
      >> public class Subclass() {}.  public class Superclass() {}.
    
    has-A:  newClass has-A / contains-A existingClass
      >> Contains a field.
      Use it when you are dealing with modifications of classes.  A class has-A field of another class type.  You would utilize has-A when you are working with separate fields.
      >> public class Container() {public contents contained;}.
*/

public class OrderedArrayList implements OrderedList {

    private SuperArray arrayList;

    public OrderedArrayList() {
        arrayList = new SuperArray();
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
     public void add( int value) {
         int dest = 0;
         for( ; dest < arrayList.size() && arrayList.get( dest) < value; dest++);
         // System.out.println( "OAR adding " + value + " at index " + dest);
         arrayList.add( dest, value);
     }
     
}