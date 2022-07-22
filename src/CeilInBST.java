public class CeilInBST {

    class Node{
        int val;
        Node left;
        Node right;
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int ceilInBST(Node root, int key){
        if(root ==null) return -1;

        Node current = root;
        int ans =0;
        while(current != null){
            if(current.val>= key ){
                ans = current.val;
                current = current.left;
            }else{
                current = current.right;
            }
        }return ans;
    }
    public static void main(String[] args) {

    }
}
