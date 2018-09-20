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

   public void removeAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }      
      Iterator it = getIteratorAt( index - 1 );
      it.currentNode.next = it.currentNode.next.next;
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
