//Diameter of a tree is  defined as the longest path between the any two nodes
import java.util.*;



public class countBinaryNODE {
    public static int max(int a,int b) {
        return a>b?a:b;
        
    }
    static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data=d;
            left=null;
            right=null;
        }
    }
    static class BT{
        static int x=-1;
        public static node builtTree(int nodes[]){
            x++;
            if(nodes[x]==-1){
                return null; 
            }
            node newnode=new node(nodes[x]);
            newnode.left=builtTree(nodes);
            newnode.right=builtTree(nodes);
            return newnode;

        }
        public static void printji(node root) {
           
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            printji(root.left);
            printji(root.right);
        }
        public static int counNodes(node root) {
            int x=0;
            int y=0;
            if(root==null){
                return 0;
            }
            else{

                x=counNodes(root.left);
                y=counNodes(root.right);
            }
            return x+y+1;
            



        }
        public static int sumNodes(node root) {
            int x=0;
            int y=0;
            if(root==null){
                return 0;
            }
            else{

                x=sumNodes(root.left);
                y=sumNodes(root.right);
            }
            return x+y+(root.data);
            



        }
        public static int heightNodes(node root) {
            int x=0;
            int y=0;
            if(root==null){
                return 0;
            }
            else{

                x=heightNodes(root.left);
                y=heightNodes(root.right);
            }
            return max(x,y)+1;
            



        }
        public static int diameter(node root) {
            int x=0,y=0;
            if(root==null){
                return 0;
            }
            x=diameter(root.left);
            y=diameter(root.right);
            int dia3=heightNodes(root.left)+heightNodes(root.right); 
            return max(max(x,y),dia3)+1;

        }
        public static void LOT(node root) {
            if(root==null){
                return;
            }
            Queue<node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left); 
                    }
                    if(curr.right!=null){
                        q.add(curr.right); 
                    }
                }
            }
// 
        }
        
    } 
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,7,-1,-1,6,-1,-1};
        BT tree=new BT();
        node root=tree.builtTree(nodes);
        tree.printji(root);
        // System.out.println();
        // int count=tree.counNodes(root);
        // System.out.println(count);

        // System.out.println();
        // int sum=tree.sumNodes(root);
        // System.out.println(sum);
        
        // System.out.println(); 
        // int height=tree.heightNodes(root);
        // System.out.println(height);
        
        // System.out.println(); 
        // int dia=tree.diameter(root);
        // System.out.println(dia);
        
        System.out.println(); 
        tree.LOT(root);

    }
}
