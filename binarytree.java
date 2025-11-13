public class binarytree {
    class Node{
        int data ;
        Node left , right;

        Node (int data){
            this.data =data;
            this.left =right =null;
        }}
    Node root;
    void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data +" ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root ==null) return;
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data +" ");
    }
    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.inorder(tree.root);
        tree.preorder(tree.root);
        tree.postorder(tree.root);
    }
}

