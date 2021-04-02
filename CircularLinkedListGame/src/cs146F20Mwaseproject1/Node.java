package cs146F20Mwaseproject1;

public class Node {
    /*Node structure*/
    //Node has the data and what it points to in circular list
        public int data;
        public Node next;
        
        public Node( int data){
            this.data = data;
            this.next = next;
        }
        public Node(){
            
        }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

}
