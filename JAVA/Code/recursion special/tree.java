import java.util.*;



public class tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int da){
            this.data=da;
            this.left=null;
            this.right=null;
        }
    }
    Node head;
    static class BinaryTree{
        static int idx=-1;
      public static Node buildTree(int arr[]) {
            idx++;
            if(arr[idx]==-1){
                return null;

            }
            Node newNode =new Node(arr[idx]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr); 
            return newNode;
        } 
        public static void preord(Node root){
            if(root==null){
                // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            preord(root.left);
            preord(root.right);
            

        }
        public static void postord(Node root){
            if(root==null){
                // System.out.print("-1"+" ");
                return;
            }
            postord(root.left);
            postord(root.right);
            System.out.print(root.data+" ");
            

        }
    }
    public static void inord(Node root){
        if(root==null){
            // System.out.print("-1"+" ");
            return;
        }
        inord(root.left);
        System.out.print(root.data+" ");
        inord(root.right);
        

    }

    static int i=0;
    public static void levelorder(Node root){
       Queue<Node> q=new ArrayDeque<>();
        if(root==null){
            return;
        }
        
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr= q.remove();
            if(curr==null){
                System.out.println();
            
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
      else{
        System.out.print(curr+" ");
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
      
    
    }
      }
}   
public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);
        // tree.preord(root);
        System.out.println();
        // tree.inord(root);
        System.out.println();
        tree.postord(root);
        System.out.println();
        levelorder(root);
        

    }
}
