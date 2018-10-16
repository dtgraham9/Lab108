
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Graham
 */
public class Client {

    /**
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
        
        //LinkedBinaryTree.parenthesize(myTree, myTree.root);
        Iterable<Position<String>> p =  myTree.breadthfirst();
        for(Position<String> s : p){
            System.out.print(s.getElement());
        }
        
    }
    
}
