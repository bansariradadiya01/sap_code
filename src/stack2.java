public class stack2{
    public static void main(String[] args) {
        int top=-1;
        int size=5;
        int []stack=new int[size];
        top=push(stack,top,size,10);
        top=push(stack,top,size,20);
        top=push(stack,top,size,30);
        top=push(stack,top,size,10);
        top=push(stack,top,size,20);

        display(stack,top);
        top=pop(stack,top);top=pop(stack,top);
        display(stack,top);
        peek(stack,top);
        display(stack,top);
        isEmpty(stack,top);
        isFull(stack,top,size);

    }

    private static void isFull(int[] stack, int top,int size) {
        if(top>=size){
            System.out.println("stack is full");
        }
    }

    private static void isEmpty(int[] stack, int top) {
        if(top==-1){
            System.out.println("empty");
        }
    }

    private static int peek(int[] stack, int top) {
        if(top==-1){
            System.out.println("empty");
            return top;
        }
        System.out.println(stack[top]+"peek value");
        return stack[top];
    }

    private static int pop(int[] stack, int top) {
        if(top==-1){
            System.out.println("empty");}
        System.out.println(stack[top]+"popped");
        top--;
        return top;
    }

    private static void display(int[] stack, int top) {
        if(top==-1){
            System.out.println("empty");
            return ;
        }
        for (int i = top; i >-1 ; i--) {
            System.out.println(stack[i]+" ");
        }
    }

    private static int push(int[] stack, int top, int size, int value) {
        if(top==size){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }

}