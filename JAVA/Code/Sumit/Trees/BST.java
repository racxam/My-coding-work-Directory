

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int val) {
            this.data = val;
        }
    }
    
    public static int inorderSucc(Node root) {
        root=root.right;
        while (root.left!=null) {
            root=root.left;
        }
        return root.data;
    }
    public static Node insert(Node root, int val) {
       if(root==null){
        root=new Node(val);
        return root;
       }
       else if(root.data>val){
            root.left=insert(root.left,val);
       }
       else {
            root.right=insert(root.right,val);
       }
       return root;
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void search(Node root, int key) {
        if(root==null){
            System.out.println();
         System.out.println("No");
         return;
        }
       if(root.data==key){
        System.out.println();
         System.out.println("Key found and the key is "+root.data);
         return;
       }
       else if(root.data>key){
        search(root.left, key);
       }
       else if(root.data<key){
        search(root.right, key);
       }
       
    }
    public static Node del(Node root, int val) {
        if(root==null){
            System.out.println("no node to delete");
            return null;
        }
        if(root.data==val){
            if(root.left ==null && root.right==null ){

              return null;
            }
            else if(root.left ==null || root.right==null ){
                if(root.left==null){
                    root=root.right;
                    return root;
                }
                else{
                    root=root.left;
                    return root;
                }
            }
            else{
               int iSucc=inorderSucc(root);
                root.data=iSucc;
                root.right=del(root.right, iSucc);
                return root;
            }


        }
        else if(root.data>val){
            root.left=del(root.left,val);
        }
        else if(root.data<val){
            root.right=del(root.right,val);
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        search(root, 7);
        root=del(root, 5);
        System.out.println() ;
        inorder(root);

       

    }
}
