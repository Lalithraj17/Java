public class linkedlist
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Inserts a new node with the given data at the beginning of the list
    Node insert(int data, Node head)
    {
        Node n = new Node(data);
        n.next = head;
        return n;
    }

    // delete at end
    Node delEnd(Node head)
    {
        if (head == null || head.next == null)
        {
            return null;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    // insert at end
    Node insrtEnd(int data, Node head)
    {
        Node n = new Node(data);
        if (head == null)
        {
            return n;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
            temp.next = n;
        }
        return head;
    }
    // delete at beginning
    Node deLeBg(Node head)
    {
        if(head == null) return null;
        return head.next;
    }
    // insert at given position
    Node insertPos(int data, int pos, Node head)
    {
        Node n = new Node(data);
        if(pos == 0)
        {
            n.next = head;
            return n;
        }
        Node temp = head;
        for(int i = 0; i < pos - 1 && temp != null; i++)
        {
            temp = temp.next;
        }
        if(temp == null) return head;
        n.next = temp.next;
        temp.next = n;
        return head;
    }
    // delete at given position
    Node delMid(Node head, int pos) 
    {
        if(head == null) return null;
        if(pos == 0) 
        {
        return head.next;
        }
        Node temp = head;
        for(int i = 0; i < pos - 1 && temp != null; i++) 
        {
            temp = temp.next;
        }
        if(temp != null)
            temp.next = temp.next.next;
            return head;
    }

    public static void main(String[] args)
    {
        // main method implementation

        
    }
}