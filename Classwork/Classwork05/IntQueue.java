/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  Implements a linked list through the queue data structure.
 *  Author        :  Maya Pegler-Gordon
 *  Date          :  2018-09-26
 *  Description   :  Modified the original IntStack class source code to an IntQueue class. Includes methods 
                     to add and delete nodes, as well as display the first node. 
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class IntQueue {

   IntLinkedList myQueue;

   IntQueue() {
      myQueue = new IntLinkedList();         // constructor
   }

   public void enQueue( int itemToPush ) {
      myQueue.prepend( itemToPush );
   }

   public int peek() {
      int index = myQueue.getSize() - 1;
      return myQueue.getIteratorAt( index  ).getCurrentInt();     // we use the iterator
   }


   public int deQueue() {
      int index = myQueue.getSize() - 1;
      return myQueue.removeAt( index );
   }

   public static void main( String[] args ) {
      IntQueue testQueue = new IntQueue();
      testQueue.enQueue( 19 );
      testQueue.enQueue( 23 );
      testQueue.enQueue( 29 );
      testQueue.enQueue( 31 );
      testQueue.enQueue( 37 );
      testQueue.enQueue( 41 );
      testQueue.enQueue( 43 );
      testQueue.enQueue( 47 );
      testQueue.enQueue( 51 );
      testQueue.enQueue( 57 );
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 57
      System.out.println( "Removing top thing: " + testQueue.deQueue() );         // 57 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 51
      System.out.println( "Removing top thing: " + testQueue.deQueue() );         // 51 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 47
      System.out.println( "Removing top thing: " + testQueue.deQueue() );         // 47 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 43
      testQueue.enQueue( testQueue.deQueue() + testQueue.deQueue() );
      System.out.println( "The top of the stack: " + testQueue.peek() );      // what'll it be?
   }
}
