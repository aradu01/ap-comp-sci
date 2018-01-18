/**
  test OrderedArrayList
*/

public class UserOfOrderedArrayList {
    public static void main(String[] commandLine) {
        
        // make a list
        OrderedArrayList list = new OrderedArrayList();
        System.out.println(list);
        System.out.println("expecting an empty list");

        // fill in when the list has no elements (to start off the list)
        list.add(-10);   
        System.out.println(list);
        System.out.println("expecting [-10,]");

        // fill in when the list only has one element
        list.add(0);
        System.out.println(list);
        System.out.println("expecting [-10,0,]");

        // add an element that belongs at the front
        list.add(-11);
        System.out.println(list);
        System.out.println("expecting [-11,-10,0,]");

        // add an element that belongs at the back
        list.add(5);
        System.out.println(list);
        System.out.println("expecting [-11,-10,0,5,]");

        // add an element that belongs somewhere in the middle
        list.add(2); 
        System.out.println(list);
        System.out.println("expecting [-11,-10,0,2,5,]");

        // add an element that is the same as another element
        list.add(0); 
        System.out.println(list);
        System.out.println("expecting [-11,-10,0,0,2,5,]");

        // add elements so expansion of a larger list is possible
        list.add(0); 
        list.add(0); 
        list.add(0); 
        list.add(0); 
        list.add(0); 
        System.out.println(list);
        System.out.println("expecting [-11,-10,0,0,0,0,0,0,0,2,5,]");

	// test new methods from the implemented interface
        System.out.println();
        System.out.println("Testing new methods from the interface...");
        System.out.println("Size of list: " + list.size());

        System.out.println("Removing value at index 2: " + list.remove(1));
        System.out.println(list);

        System.out.println("New size of list: " + list.size());

        System.out.println("Returning value at index 0: " + list.get(0));
        System.out.println("Returning value at index 9: " + list.get(9));

    }
}