public class CeilInBST {

    //node
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
    //ceil is a number in the tree which is greater than or equals to the given target/ key

    public static int ceilInBST(Node root, int key){
        if(root ==null) return -1;

        Node current = root;
        int ans =0;
        //until it reaches the end
        while(current != null){
            //basically, it will check for the the other smaller element if its greater,
            // as left side of bst stores smaller values
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
