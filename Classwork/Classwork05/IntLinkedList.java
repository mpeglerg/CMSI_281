/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  Implements a linked list.
 *  Author        :  Maya Pegler-Gordon
 *  Date          :  2018-09-26
 *  Description   :  Includes methods to display size of list, prepend nodes, insert new nodes, and delete nodes. 
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */


public class IntLinkedList {

   private Node head;
   private int  size;

  // the constructor
   IntLinkedList() {
      head = null;
      size = 0;
   }

   public int getSize() {
      return size;
   }

   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }

   public void insertAt( int index, int valueToAdd ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = getIteratorAt( index - 1 );
      Node newNode = new Node(valueToAdd);
      newNode.next = it.currentNode.next;
      it.currentNode.next = newNode;
   }

   public int removeAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }      
      int val;
      if ( index == 0 ) {
         val = this.head.data;
         this.head = head.next;
         size--;
         return val;
      } else {
         Iterator it = getIteratorAt( index - 1 );
         Iterator itToDelete = getIteratorAt( index );
         // System.out.println("Data value removed: " + itToDelete.getCurrentInt());
         val = it.currentNode.data;
         it.currentNode = it.currentNode.next;
         size --;
         return val;
      }
   }


   private class Node {

      int data;            // remember this is an IntLinkedList
      Node next;           // here's the self-referential part

      // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }

   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }

   public class Iterator {
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

   }
}