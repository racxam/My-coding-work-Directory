

public class BuiltTree {
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
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,3,-1,6,-1,-1};
        BT tree=new BT();
        node root=tree.builtTree(nodes);
        System.out.println(root.data);

         
    }
}
