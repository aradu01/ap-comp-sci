/**
   SuperFly encapsulates the implementation of a list of disparate types,
   programmed without polymorphism
*/

public class SuperFly {

    private int filledElements; // the number of elements in this list

    // underlying containers
    private int[]    intData;
    private double[] doubleData;
    private String[] stringData;
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
       1 means element i is a double;
       2 means element i is a String.
    */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    
    /** 
	Constructs an empty list with an initial capacity of ten,
	and with no elements initially.
    */
    public SuperFly() {
	typeOfElements = new int[INITIAL_CAPACITY];
	intData = new int[INITIAL_CAPACITY];
	doubleData = new double[INITIAL_CAPACITY];
	stringData = new String[INITIAL_CAPACITY];
    }

    
    /** 
	@return the number of elements in this list
    */
    public int size() {
	return filledElements;
    }


    /** 
	@return a string representation of this list, in [a,b,c,] format
    */ 
    public String toString() {
	String result = "[";
	for (int a = 0; a < filledElements; a++) {
	    if (typeOfElements[a] == 0) {
		result += intData[a] + ", ";
	    }
	    if (typeOfElements[a] == 1) {
		result += doubleData[a] + ", ";
	    }
	    if (typeOfElements[a] == 2) {
		result += stringData[a] + ", ";
	    }
	}
	return result + "]";
    }


    /** 
	Appends @value to the end of this list.
      
	@return true, in keeping with conventions yet to be discussed
    */
    public boolean add(int type,   // values have same meaning as in typeOfElements
		       int intValue,
		       double doubleValue,
		       String stringValue) {
	if (filledElements == typeOfElements.length) {
	    expand();
	}
	else {
	    if (type == 0) {
		typeOfElements[filledElements] = 0;
		intData[filledElements] = intValue;
	    }
	    if (type == 1) {
		typeOfElements[filledElements] = 1;
		doubleData[filledElements] = doubleValue;
	    }
	    if (type == 2) {
		typeOfElements[filledElements] = 2;
		stringData[filledElements] = stringValue;
	    }
	    filledElements++;
	}
	return true;
    }


    /** 
	Doubles the capacity of the SuperFly, 
	preserving existing data
    */
    private void expand() {
        int[] bigType = new int[2 * typeOfElements.length];
        int[] bigInt = new int[2 * intData.length];
        double[] bigDouble = new double[2 * doubleData.length];
        String[] bigString = new String[2 * stringData.length];

        for (int b = 0; b < typeOfElements.length; b++) {
            bigType[b] = typeOfElements[b];
            bigInt[b] = intData[b];
            bigDouble[b] = doubleData[b];
            bigString[b] = stringData[b];
        }
        
        typeOfElements = bigType;
        intData = bigInt;
        doubleData = bigDouble;
        stringData = bigString;
    }
    
}