package fiveyrs.tree;

public class InOrder {

    // Always remember inOrder will be = left-> Node-> right
    public static void main(String[] args) {
        Node node=new Node(50);
        node.left=new Node(30);
        node.left.left=new Node(20);
        node.left.right=new Node(40);
        node.left.right.left=new Node(35);
        node.right=new Node(70);
        node.right.left=new Node(60);
        node.right.right=new Node(80);
        inOrder(node);
/*

            50
          /    \
        30      70
       /  \    /  \
     20   40  60   80
         /
        35

*/
    }
    public static void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left); //left
        System.out.print(node.data + " "); //Node
        inOrder(node.right); //right

    }
}
