import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//import org.w3c.dom.Node;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class tree {
//    public static void main(String[] args) {
//        BTree bTree;
//        bTree = new BTree();
//        bTree.root=new Node11(10);
//        bTree.root.left=new Node11(20);
//        bTree.root.right=new Node11(30);
//        bTree.root.left.left=new Node11(40);
//        bTree.root.left.right=new Node11(50);
//        bTree.root.right.left=new Node11(60);
//        bTree.root.right.right=new Node11(70);
//        bTree.root.right.left.left=new Node11(80);
//        bTree.root.right.left.right=new Node11(90);
//        System.out.println("level order");
//        bTree.LevelOrder();
//        System.out.println(" inorder");
//        bTree.inorder(bTree.root);
//        System.out.println("preorder");
//        bTree.preorder(bTree.root);
//        System.out.println("postorder");
//        bTree.postorder(bTree.root);
//
//
//    }
//}
//class BTree{
//    Node11 root;
//    public void LevelOrder(){
//        Queue<Node11> queue=new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            Node11 node = queue.poll();
//            System.out.println(node.data);
//            if(node.left!=null) {
//                queue.add(node.left);
//            }
//        if(node.right!=null){
//        queue.add(node.right);}
//        }
//    }
//    public void inorder(Node11 root){
//       if(root == null){
//           return ;
//       }
//       inorder(root.left);
//        System.out.println((root.data));
//       inorder(root.right);
//    }
//    public void preorder(Node11 root){
//        if(root == null){
//            return ;
//        }
//        System.out.println((root.data));
//        inorder(root.left);
//
//        inorder(root.right);
//    }
//    public void postorder(Node11 root){
//        if(root == null){
//            return ;
//        }
//        inorder(root.left);
//
//        inorder(root.right);
//        System.out.println((root.data));
//    }
//
//
//
//}
//
//class Node11{
//    int data;
//    Node11 left,right;
//
//    public Node11(int data){
//        this.data=data;
//    }
//}
//
class tree{
    public static void main(String[] args) {
       BTree bTree = new BTree();
       bTree.root=new Node11(10);
        bTree.root.left=new Node11(20);
        bTree.root.right=new Node11(30);
        bTree.root.left.left=new Node11(40);
        bTree.root.left.right=new Node11(50);
        System.out.println("level order");
        bTree.levelorder();
        System.out.println("zigzag print: ");
        bTree.zigzag();
    }
}
class BTree {
    Node11 root;
    public void zigzag(){
//        Deque<Node11> deque = new LinkedList<>();
//        deque.add(root);
//        Boolean flag = false;
//
//        while (!deque.isEmpty()) {
//
//            int size = deque.size();
//            if(!flag){
//                while(size > 0){
//                    Node11 node = deque.getFirst();
//
//                    if(node.left != null){
//                        deque.addLast(node.left);
//                    }
//                    if(node.right != null){
//                        deque.addLast(node.right);
//                    }
//                    System.out.print(node.data + " ");
//                    size--;
//                    deque.removeFirst();
//                }
//            }else{
//                while(size > 0){
//                    Node11 node = deque.getLast();
//
//                    if(node.right != null){
//                        deque.addFirst(node.right);
//                    }
//                    if(node.left != null){
//                        deque.addFirst(node.left);
//                    }
//                    System.out.print(node.data + " ");
//                    size--;
//                    deque.removeLast();
//                }
//
//            }
//            flag = !flag;
//        }
        Deque<Node11> deque = new LinkedList<>() ;
        deque.add(root);
        boolean flag=false;
        while(!deque.isEmpty()){
            int size= deque.size();
            if(!flag){
                while(size>0){
                        Node11 node=deque.getFirst();
                        if(node.left!=null){
                            deque.addLast(node.left);
                        }
                        if(node.right!=null){
                            deque.addLast(node.right);
                        }
                    System.out.println(node.data+" ");

size--;
                deque.removeFirst();}

            }
            else{
                while(size>0){
                    Node11 node=deque.getLast();
                    if(node.left!=null){
                        deque.addFirst(node.left);
                    }
                    if(node.right!=null){
                        deque.addFirst(node.right);
                    }

                System.out.println(node.data);
                    size--;
                    deque.removeLast();

            }}
        flag=!flag;}
    }

    public void levelorder() {
//        Queue<Node11> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node11 node = queue.poll();
//            System.out.println(root.data);
//
//            if (node.left != null) {
//                queue.add(node.left);
//
//            }
//            if (node.right != null) {
//                queue.add(node.right);
//            }
//        }
      Queue<Node11> queue=new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
        Node11 node=queue.poll();
          System.out.println(root.data);
      if(node.left !=null){
          queue.add(node.left);
      }
      if(node.right !=null){
          queue.add(node.right);
      }
      }
      }

}
class Node11{
    int data;
    Node11 left,right;
    public Node11(int data){
        this.data=data;
    }
}