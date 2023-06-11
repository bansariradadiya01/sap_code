import java.util.Stack;

public class ll1{
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.print();
       // linkedList.find(20);
   //     int n=1;
//        linkedList.printNthNode(n);
//        linkedList.printNthNodeFromLast(n);
//        linkedList.count();
//        System.out.println("Before update");
//        linkedList.print();
//        System.out.println("After update");
//        linkedList.update(20, 200);
//        linkedList.print();
//        linkedList.delete(20);
//        linkedList.print();
        System.out.print("Reverse:  ");
        linkedList.printRev();

    }
}

class LinkedList{
    Node head;
    Node tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null){
            head = nn;
            tail = nn;
        }else {
            tail.next = nn;
            tail = nn;
        }
    }


    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");

            temp = temp.next;
            System.out.println();
        }
    }




    public void printRev() {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public void delete(int value) {
        if (head == tail && head.data == value){
            tail = null;
            head = null;
        }else if(head.data == value){
            Node temp = head;
            head = head.next;
            temp.next = null;
        }else if(tail.data == value){
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }else {
            Node temp = head;
            while (temp.next.data != value){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void find(int value) {
        Node temp = head;
        while (temp != null){
            if(temp.data == value){
                System.out.println("Present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not present");
    }

    public void update(int olV, int newV) {
        Node temp = head;
        while (temp != null){
            if(temp.data == olV){
                temp.data = newV;
            }
            temp = temp.next;
        }
    }


    public void count() {
        int count=0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("count: " + count);
    }

    public void printNthNode(int n) {
        int count=0;
        Node temp = head;
        while (temp != null){
            count++;
            if (count == n){
                System.out.println("Nth Node: " + temp.data);
                return;
            }
            temp = temp.next;
        }
    }

    public void printNthNodeFromLast(int n) {
        int count=0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int nTh = count - n + 1;
        count = 0;
        while (temp != null){
            count++;
            if (count == nTh){
                System.out.println("Nth from last: " + temp.data);
            }
            temp = temp.next;
        }
    }



}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}