package Stack;

import java.util.EmptyStackException;

public class MyStack{

    private static class StackNode{
        private int data;
        private StackNode next;

        public StackNode(int data)
        {
            this.data=data;
        }
    }

    private StackNode top=null;

    public void push(int item)
    {
        StackNode newNode = new StackNode(item);
        newNode.next = this.top;
        System.out.println(newNode.data+" pushed to the stack");
        this.top=newNode;
    }

    public int pop()
    {
        if(isEmpty()) throw new EmptyStackException();
        int data = top.data;
        top=top.next;
        return data;
    }

    public int peek()
    {
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty()
    {
        return top==null;
    }

    public static void main(String args[])
    {
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);
        System.out.println("Popped "+st.pop()+" from the stack");
        System.out.println("There is "+st.peek()+" at the top of the stack");
        System.out.println("Popped "+st.pop()+" from the stack");
        System.out.println("Popped "+st.pop()+" from the stack");
    }

}