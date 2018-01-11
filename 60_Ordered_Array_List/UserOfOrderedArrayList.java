public class UserOfOrderedArrayList {

    public static void main(String[] args) {
    // make a list
    OrderedArrayList list = new OrderedArrayList();
    System.out.println(list);
    System.out.println("expecting an empty list");

    // fill in when the list has no elements (to start off the list)
    list.add(-10);   
    System.out.println(list);
    System.out.println("expecting: -10");

    // fill in when the list only has one element
    list.add(0);

    System.out.println(list);
    System.out.println("expecting: -10 , 0");

    // add an element that would have to go at the front
    list.add(-11);
    System.out.println(list);
    System.out.println("expecting: -11 , -10 , 0");

    // add an element that would have to go at the back
    list.add(11);
    System.out.println(list);
    System.out.println("expecting: -11 , -10 , 0, 11");

    // add an element that would have to go somewhere in the middle
    list.add(2); 
    System.out.println(list);
    System.out.println("expecting: -11 , -10 , 0, 2, 11");

    // add an element that is the same as another element
    list.add(0); 
    System.out.println(list);
    System.out.println("expecting: -11 , -10 , 0, 0, 2, 11");

    // add elements so expansion of a larger list is possible
    list.add(0); 
    list.add(0); 
    list.add(0); 
    list.add(0); 
    list.add(0); 
    System.out.println(list);
    System.out.println("expecting: -11 , -10 , 0, 0, 0, 0, 0, 0, 0, 2, 11");
    }

}