/**
  SuperArray stores list data and implements list operations
  by encapsulating an array.
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class SuperArray {

    private Object[] _data;        // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;

    /** 
      @return whether two arrays are equivalent, considering...
              Strings ignoring case; 
              Doubles within TOLERANCE
     */



     // -------- previously-tested code below here ---------
    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperArray() {
        _data = new Object[ INITIAL_CAPACITY];
        // filledElements 0 is already correct
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /** 
       @return a string representation of this list, in [a,b,c,] format.
       Uses polymorphism. For each of this method's implicit calls to
           _data[ i].toString()
       the JVM will find the overriding method for the actual class
       of the object that _data[ i] refers to.
      */ 
    public String toString() {
        String result = "[";
        for (int i = 0; i < filledElements; i++)
            result += _data[ i] + ",";
        return result + "]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( Object value) {
         // expand if necessary
         if (filledElements == _data.length) {
             expand();
         }
         _data[filledElements] = value;
         filledElements++;
         // idiomatic version: _data[ filledElements++] = value;
         return true;
     }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving existing _data
     */
     private void expand() {
        Object[] bigger = new Object[ _data.length * 2];
        for( int i = 0; i < filledElements; i++) {
            bigger[i] = _data[i];
        }
        _data = bigger;
     }
    
    public boolean equals(SuperArray other) {
        if (this.size() == other.size()) {
            for (int y = 0; y < this.size(); y++) {
                if (this._data[y] instanceof String) {
                    if (! ((String) (this._data[y])).equalsIgnoreCase((String) other._data[y])) {
                        return false;
                    }
                }
                else if (this._data[y] instanceof Double) {
                    if (Math.abs((double) this._data[y] - (double) other._data[y]) > 1e-6) {
                        return false;
                    }
                }
                else if (! this._data[y].equals(other._data[y])) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
}