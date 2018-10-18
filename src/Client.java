/**
 * Creates a binary tree structure and traverses it by preorder, 
 * postorder, inorder, and breadth first
 * @author Graham Thompson
 */
public class Client {

    /**
     * Creates a binary tree structure and traverses it by preorder, 
     * postorder, inorder, and breadth first
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedBinaryTree myTree = new LinkedBinaryTree();
        myTree.addRoot("*");
        myTree.addRight(myTree.root, "8");
        myTree.addLeft(myTree.root, "+");
        myTree.addRight(myTree.root.getLeft(), "-");
        myTree.addLeft(myTree.root.getLeft().getRight(), "-");
        myTree.addRight(myTree.root.getLeft().getRight(), "1");
        myTree.addLeft(myTree.root.getLeft().getRight().getLeft(), "7");
        myTree.addRight(myTree.root.getLeft().getRight().getLeft(), "2");
        myTree.addLeft(myTree.root.getLeft(), "/");
        myTree.addRight(myTree.root.getLeft().getLeft(), "+");
        myTree.addLeft(myTree.root.getLeft().getLeft().getRight(), "2");
        myTree.addRight(myTree.root.getLeft().getLeft().getRight(), "9");
        myTree.addLeft(myTree.root.getLeft().getLeft(), "*");
        myTree.addRight(myTree.root.getLeft().getLeft().getLeft(), "-");
        myTree.addLeft(myTree.root.getLeft().getLeft().getLeft().getRight(), "2");
        myTree.addRight(myTree.root.getLeft().getLeft().getLeft().getRight(), "1");
        myTree.addLeft(myTree.root.getLeft().getLeft().getLeft(), "+");
        myTree.addLeft(myTree.root.getLeft().getLeft().getLeft().getLeft(), "5");
        myTree.addRight(myTree.root.getLeft().getLeft().getLeft().getLeft(), "2");
        
        System.out.println("Equation: (((5+2)*(2-1)/((2+9))+((7-2)-1))*8)");
        Iterable<Position<String>> preOrder = myTree.preorder();
        System.out.print("Preorder Traversal: ");
        for(Position<String> po : preOrder){
            System.out.print(po.getElement() + " ");
        }
        Iterable<Position<String>> inOrder = myTree.inorder();
        System.out.print("\nInorder Traversal: ");
        for(Position<String> i : inOrder){
            System.out.print(i.getElement() + " ");
        }
        System.out.print("\nPostorder traversal: ");
        Iterable<Position<String>> postOrder = myTree.postorder();
        for(Position<String> ps : postOrder){
            System.out.print(ps.getElement() + " ");
        }
        System.out.print("\nBreadth Traversal: ");
        Iterable<Position<String>> p =  myTree.breadthfirst();
        for(Position<String> s : p){
            System.out.print(s.getElement() + " ");
        }
        System.out.print("\nPreorder Indent Traversal: \n");
        LinkedBinaryTree.printPreorderIndent(myTree, myTree.root, 0);
        System.out.print("\nParenthesized traversal: ");
        LinkedBinaryTree.parenthesize(myTree, myTree.root);
        System.out.print("\n");
        
    }
    
}
