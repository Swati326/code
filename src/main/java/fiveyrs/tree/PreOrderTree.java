package fiveyrs.tree;

public class PreOrderTree {

    // Always remember preOrder will be = Node-> left-> right
    public static void main(String[] args) {
        Node node=new Node(50);
        node.left=new Node(30);
        node.left.left=new Node(20);
        node.left.right=new Node(40);
        node.left.right.left=new Node(35);
        node.right=new Node(70);
        node.right.left=new Node(60);
        node.right.right=new Node(80);
        preOrder(node);
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
    public static void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }

        System.out.print(node.data + " "); //Node
        preOrder(node.left); //left
        preOrder(node.right); //right

    }
}
