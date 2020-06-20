package datastructure;

public class BinarySearchTree {
    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right =null;
        }

        @Override
        public String toString() {
            return "Node="+data;
        }
    }
    private Node root;
    public void insert(int data){
        var node =new Node(data);
        if(root==null){
            root=node;
            return;
        }

        var temp = root;

        while(true){
            if(temp.data>data){
                if(temp.left==null){
                    temp.left=node;
                    return;
                }
                temp=temp.left;
            }else{
                if(temp.right==null){
                    temp.right=node;
                    return;
                }
                temp=temp.right;
            }
        }
    }
    public boolean find(int data){
        var temp=root;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            if(temp.data>data)
                temp=temp.left;
            else
                temp=temp.right;
        }
        return false;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public int height(){
       return height(root);
    }
    private int height(Node root){
        if(root.left==null&&root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int min(){
        return min(root);
    }
    private int min(Node root){
        if(root.left==null&&root.right==null){
            return root.data;
        }
        var left=min(root.left);
        var right=min(root.right);
        return Math.min(Math.min(left,right),root.data);
    }
    
}
