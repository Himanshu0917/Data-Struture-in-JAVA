package Trees;
import java.util.Scanner;
public class Trees {
    public static TreeNode<Integer> takeinput(){
        int n ;
        Scanner in  = new Scanner(System.in);
        System.out.println("enter  the next node");
        n = in.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("enter the number of children for"+n);
        int childcount = in.nextInt();
        for(int i =0;i<childcount;i++){
            TreeNode<Integer> child = takeinput();
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i=0;i<root.children.size();i++){
            s = s + root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){ 
            print(root.children.get(i));

        }

    }
    public static void main(String []args){
        TreeNode<Integer> root = takeinput();
        print(root);


    // TreeNode<Integer> root = new TreeNode<Integer>(4);
    // TreeNode<Integer> node1 = new TreeNode<Integer>(2);
    // TreeNode<Integer> node2 = new TreeNode<Integer>(3);
    // TreeNode<Integer> node3 = new TreeNode<Integer>(5);
    // TreeNode<Integer> node4 = new TreeNode<Integer>(6);
    // root.children.add(node1);

    // root.children.add(node2);
    // root.children.add(node3);
    // node2.children.add(node4);
    // System.out.println(root.data);


    } 
}
