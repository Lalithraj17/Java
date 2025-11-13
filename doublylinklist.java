public class doublylinklist {
// Double Linked List Implementation in Java
    class Node
    {
        int data;
        Node prev, next;

        Node(int data)
        {
            this.data=data;
            this.prev = next = null;
        }
    }

    Node head, tail = null;

    // insert at first
    void insFirst(int data)
    {
        Node n = new Node(data);
        if(head == null) 
        head = tail = n;
        else
        {
            n.next = head;
            head.prev=n;
            head=n;
        }
    }

    // insert at last
    void insLast(int data)
    {
        Node n = new Node(data);
        if(tail == null) 
        head = tail = n;
        else
        {
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }

void display(){
    Node current = head;
    while (current != null){
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
//delite at first
void delfirst(){
    if(head == null) return;
    if(head == tail) head = tail = null;
    else{
        head = head.next;
        head.prev = null;
    }
}

    //delite at last
void dellast(){
    if(tail == null) return;
    if(head == tail) head = tail = null;
    else{
        tail = tail.next;
        tail.prev = null;
    }
}


void delNode(int data){
    if(data == 0) {
        delfirst();
        return;
    }
    Node current = head;
    for(int i=0; i<data && current != null; i++){
        current = current.next;
    }
    if(current == null) return;
    if(current == tail){
        dellast();
        return;
    }
    current.prev.next = current.next;
    current.next.prev = current.prev;
}

// Run | Debug
public static void main(String[] args) {
    doublylinklist s = new doublylinklist();
    s.insFirst(data:10);
    s.insFirst(data:20);
    s.insFirst(data:30);
    s.insFirst(data:40);
    s.insFirst(data:50);
    s.display();
}
}
