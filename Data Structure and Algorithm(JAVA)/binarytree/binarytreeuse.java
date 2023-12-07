package binarytree;
import java.util.*;

import javax.sound.midi.Synthesizer;
public class binarytreeuse {
    public static void printnode(binarytreenode<Integer> root){
        if(root ==null){
            return;
        }
        String tobeprinted = root.data + "";
        if(root.left!=null){
            tobeprinted+="L:"+root.left.data+",";
        }
        if(root.right != null){
            tobeprinted+="R:"+root.right.data;
        }
        System.out.println(tobeprinted);
        printnode(root.left);
        printnode(root.right);

    }
    //inoder traversal 
    public static void inorder(binarytreenode<Integer> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // public static binarytreenode<Integer> takeinputlevelwise(){
    //     Scanner in =  new Scanner(System.in);
        
    }
    public static binarytreenode<Integer> takeinput(Scanner in){
        int rootdata;
        System.out.println("enter the root data");
        rootdata = in.nextInt();
        if(rootdata==-1){
            return null;
        }
        binarytreenode<Integer> root = new binarytreenode<Integer>(rootdata);
        root.left = takeinput(in);
        root.right = takeinput(in);
        return root;

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        binarytreenode<Integer> root = takeinput(in);
        printnode(root);
        in.close();
    }
}
