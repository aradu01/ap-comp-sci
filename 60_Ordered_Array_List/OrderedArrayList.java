/**
  SuperArray stores list data and implements list operations
  by encapsulating an array.
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class OrderedArrayList {

    private SuperArray data;
        
    public OrderedArrayList() {
        data = new SuperArray();
    }
    
    public boolean add(int value) {
        if (data.size() == 0) {
            data.add(value);
        }
        else if (value > data.get(data.size() - 1)) {
            data.add(data.size(), value);
        }
        else {
            for (int counter = 0; counter < data.size(); counter++) {
                if (data.get(counter) > value) {
                    data.add(counter, value);
                    break;
                }
            }
        }
        return true;
    }
    
    public String toString() {
        return data.toString();
    }
    
}