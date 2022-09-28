public class stack9 {
    public static void main(String[] args) {
        int[] stack = new int[10];
        int[] minStack = new int[10];
        int top = -1;
        int minTop = -1;

        int value1 = 1;
        if(isEmpty(minTop) || peek(minStack, minTop) > value1){
            minTop = push(minStack, minTop, value1);
        }
        top = push(stack, top, value1);

        if(peek(stack, top) == peek(minStack, minTop)){
            minTop = pop(minTop);
        }
        top = pop(top);

        System.out.println(getMin(minStack, minTop));
    }

    private static int getMin(int[] stack, int top){
        return stack[top];
    }

    private static int push(int[] stack, int top, int value){
        top++;
        stack[top] = value;
        return top;
    }

    private static int pop(int top){
        top--;
        return top;
    }

    private static int peek(int[] stack, int top){
        return stack[top];
    }

    private static boolean isEmpty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
}