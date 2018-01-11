/**
	OrderedArrayList
 
	a list with the invariant the elements are in order by
	increasing value.
*/

import java.util.ArrayList;

public class OrderedArrayList {

    private ArrayList<Integer> arrayList;
    
    public OrderedArrayList() {
        arrayList = new ArrayList<Integer>();
    }
    
	/**
    @return a string representation of this OrderedArrayList
	*/
	public String toString() {
    	String result = "[";
        if (arrayList == null) {
            return result + "]";
        }
        else {
            return arrayList + "";
        }
	}
    
	/**
    Put @value where it belongs in the list.
    @pre: the list is in increasing order
	*/
	public void add(int value) {
        arrayList.add(value);
	}
	
    public int size() {
        return arrayList.size();
	}
	
    public Object get(int index) {
        return arrayList.get(index);
	}
	
    public Object remove(int index) {
        return arrayList.remove(index);
	}
    
}