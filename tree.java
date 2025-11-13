public class tree {
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

Node root;
public Node insr(Node root, int data){
    if(root == null)
        return new Node(data);
    if(data < root.data){
        root.left = insr(root.left, data);
    }
    else if( data > root.data){
        root.right = insr(root.right, data);
    }
    return root;
}

void inorder(Node root){
    if(root != null){
        inorder(root.left);
        System.out.out.print(root.data + " ");
        inorder(root.right);
    }
}

void display(){
    inorder(root);
    System.out.println();
}

public static void main(String[] args) {
    Student s = new Student();
    s.root = s.insr(s.root,50);
    s.insr(s.root,30);
    s.insr(s.root,20);
    s.insr(s.root,40);
    s.insr(s.root,70);
    s.insr(s.root,60);
    s.display();
}
}
