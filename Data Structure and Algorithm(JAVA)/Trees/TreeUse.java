package Trees;
import java.util.Scanner;
import Queue.queueusingarray;
public class TreeUse {
    public static TreeNode<Integer> TakeInput(){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("enter the number of children for"+n);
        int childcount= in.nextInt();
        for(int i =0;i<childcount;i++){
            TreeNode<Integer> child  = TakeInput();
            root.children.add(child);
        }
        return root;
    }
    
    public static void print(TreeNode<Integer> root){
        String s = root.data +":";
        for(int i=0;i<root.children.size();i++){
            s = s + root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }
    // public static TreeNode<Integer> takeinput(){
    //     int n;
    //     Scanner s = new Scanner(System.in);
    //     n = s.nextInt();
    //     TreeNode<Integer> root  = new TreeNode<Integer>(n);
    //     System.out.println("eneter no. of children for "+n);
    //     int countchild = s.nextInt();
    //     for(int i=0;i<countchild;i++){
    //         TreeNode<Integer> child = takeinput();
    //         root.children.add(child);
    //     }
    //     return root;
    // }
    public static TreeNode<Integer> TakeInputLevelWise(){
        Scanner in  = new Scanner(System.in);
        System.out.println("enter root data");
        int rootdata = in.nextInt();
        queueusingarray<TreeNode<Integer>> pendingnodes = new queueusingarray<>();
        pendingnodes.enqueue(rootdata);
        while(!pendingnodes.isempty()){
            
        }


    }
    public static void main(String args[])
    {
        TreeNode<Integer> root = TakeInput();
        print(root);
    }
}
