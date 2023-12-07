package Trees;
import java.util.*;
public class usetree {
    public static TreeNode<Integer> takeinput(){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("enter the number of children of root");
        int count = in.nextInt();
        for(int i=0;i<count;i++){
            TreeNode<Integer> child = takeinput();
            root.children.add(child);
        }
        return root;
    }

    public static void printnode(TreeNode<Integer> root){
        String s = root.data+":";
        for(int i=0;i<root.children.size();i++){
            s = s+ root.children.get(i).data+",";
        }System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            printnode(root.children.get(i)); 
        }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> root = takeinput();
        printnode(root);
    }
}
