package cs146F20Mwaseproject1;

public class LinkedListGame {
    public Node head;
    public Node tail;
    int size = 0;

    public void add(int data){
        ++size;
        //if the list is empty, create a new Node and add data to it
        if (head == null){
            Node newNode = new Node(data);
            //The head is now the new Node
            this.head = newNode;
            //Make the list circular. If its null and you add one element, the head and tail point to the same new Node
            newNode.setNext(head);
            this.tail = head;
        } else {
            //if you already have data and want to add a node and its data
            add(data, head);
        }
    }

    public void add(int data, Node node){
        if (node != tail){
            add(data, node.getNext());      //if node is not the tail, add new data recursively
        }else {
            //create a new Node
            Node newNode = new Node(data);
            //incoming node set as the next node to add
            node.setNext(newNode);
            //the incoming node points to the head to make it circular
            newNode.setNext(head);
            //newNode is a tail that points to the head
            this.tail = newNode;
        }
    }

    public void traverse(){

        Node current = head;
        if (head == null){
            System.out.println("empty");
        }
        else {
            System.out.println("list has...");
            do {
                System.out.print(current.data + " ");
                //move to next element
                current = current.next;
            }while (current != head);
        }
    }

    public void deleteElement(int data){
    //1.Node to be deleted is the first node of the list and list contains more elements
        if (this.head.data == data && this.head.getNext() != null){
            //The tail should point to the head's next
            this.tail.setNext(this.head.getNext());
            //the head is moved to be the head's next
            this.head = this.head.getNext();
            //reduce size by 1 and the head will be deleted
            size--;
            return;
        }

        //If node is in between, create a temp, point to the head to the temp, and then to the next of the soon to be deleted node
        Node newHead = this.head;   ///newHead holds the head

        //traverse while there is not just one element left
        while (newHead != tail){
            //while traversing, if the next element is not the element to delete, go to the next node
            if (newHead.getNext().data != data){
                newHead = newHead.getNext();
            } else {
                //The new head now points to the node after the element to be deleted
                newHead.setNext(newHead.getNext().getNext());
                //Reduce the size to do away with found element
                size--;
                return;
            }
        }

        //if the node is the last and only element left
        newHead = this.head;
        while (newHead != tail) {
            if (newHead.getNext() != tail) {
                newHead = newHead.getNext();
            } else {
                //since only element left
                newHead.setNext(null);
                //reduce the size
                size--;
                //tail and head are the same
                this.tail = newHead;
                tail.setNext(head);
                return;
            }
        }
    }

    public int lucky(int k){
     Node unlucky = this.head;

         while (size != 1){
            for (int i = 1; i <= k ; i++) {
                 unlucky = unlucky.getNext();
            }
            deleteElement(unlucky.getData());
            unlucky = unlucky.getNext();
         }
         return this.head.getData();
     }
    
    public boolean isEmpty() {
   
    	Node current = head;
        if (head != null){
            return false;
        }
		return true;
    }


    public static void main(String[] args) {
        LinkedListGame game = new LinkedListGame();
        game.add(1);
        game.add(2);
        game.add(3);
        game.add(4);
        game.add(5);
        game.add(6);
        game.add(7);
//        game.add(8);
//        game.add(9);
//        game.add(10);
//        game.add(11);
//        game.add(12);


        game.traverse();
        System.out.println();
        System.out.println("The winner is " + game.lucky(7));



    }


}
