/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArrayApp.java
 *  Purpose       :  A test harness file for testing out the methods in the "HighArrayApp.java" class.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-09-10
 *  Description   :  Provides several tests to check all methods from "HighArrayApp.java" are working correctly.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class HighArrayApp{
  public static void main(String[] args) {
    int maxSize = 150;
    HighArray arr;
    arr = new HighArray(maxSize);
    System.out.println("Max of empty array: " +     arr.getMax());  // should return -1
    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    arr.display();
    int searchKey = 35;
    if( arr.find(searchKey) ) {
      System.out.println("Found " + searchKey);
    } else {
      System.out.println("Can’t find " + searchKey);
    }
    System.out.println("Initial Max: " +     arr.getMax()); //should return 99
    arr.insert(120);
    arr.display();
    System.out.println("");
    System.out.println("New Max: " +     arr.getMax());  // should return 120
    System.out.println("Deleting 0, 55, & 99");
    arr.delete(00);
    arr.delete(55);
    arr.delete(99);
    arr.display();
    System.out.println("");
    System.out.println("Adding Dupes");
    arr.insert(77);
    arr.insert(33);
    arr.display();
    System.out.println("");
    arr.noDupes();
    System.out.println("Removed Dupes 77 & 33");
    arr.display();
    System.out.println("");
    System.out.println("Deleted 120 and added -98");
    arr.delete(120);
    arr.insert(-98);
    arr.display();
    System.out.println("");
    System.out.println("New Max: " +     arr.getMax());  // should return 88
    arr.insert(-98);
    arr.insert(22);
    arr.display();
    arr.noDupes();
    System.out.println("");
    System.out.println("Removed Dupes -98 & 22");
    arr.display();
  }
}
