/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Provides a class that creates an array of longs and allows user to manipulate its data.
 *  Author        :  Talia Bahar, Maya Pegler-Gordon
 *  Date          :  2018-09-10
 *  Description   :  This program contains multiple methods that allows a user to find, remove, and add values to an array.
                     It also contains a method to remove dupes, get the max value of the array, and to display the array.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Arrays;

public class HighArray {
private long[] a; // ref to array a
private int nElems; // number of data items

public HighArray(int max) {    //constructor
  a = new long[max]; nElems = 0;  //creates the array ~ no items yet
}

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to check if denominations are negative.
  * @param searchKey  int[] of the denominations
  * @return true if searchKey is found in array, false if searchKey cannot be found in array
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public boolean find(long searchKey) {
    int j;
    for(j=0; j<nElems; j++) {
      if(a[j] == searchKey) {
        break;
      }
    }
    if(j == nElems) {
      return false;
    } else {
      return true;
    }
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to insert number into array.
  * @param value  represents long user wants to insert
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void insert(long value) {
    a[nElems] = value;
    nElems++;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to delete number from array.
  * @param value  represents long user wants to delete
  * @return true if value is found and deleted, false if value cannot be found
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public boolean delete(long value){
    int j;
    Boolean b = true;
    for(j=0; j<nElems; j++){
      if(value == a[j]){
        break;
      }
    }
    if(j==nElems){
      b = false;
    } else {
        for (int k=j; k<nElems; k++) { //tab?
          a[k] = a[k+1];
          b = true;
        }
        nElems--;
      }
    return b;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to find largest value in array.
  * @return highest key in array or -1 if the array is empty
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public long getMax() {
    long tempMax = -1;
    if ( a.length == 0){
      return tempMax;
    } else {
      for (int i=0; i < nElems; i++) {
        if(tempMax < a[i]) {
          tempMax = a[i];
        }
      }
    }
    return tempMax;
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to remove all duplicates from array.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void noDupes() {
    for(int i=0; i < nElems-1; i++) {
      for(int j=i+1; j < nElems; j++) {
        if(a[i] == a[j]) {
          delete(a[j]);
        }
      }
    }
  }

  /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Method to display array contents.
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  public void display(){
    for(int j=0; j<nElems; j++) {
      System.out.print(a[j] + " ");
      System.out.print("");
    }
  }
}
