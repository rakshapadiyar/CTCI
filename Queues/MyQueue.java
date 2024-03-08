public class MyQueue {
    private static class QueueNode{
        private int data;
        private QueueNode next;
        public QueueNode(int data)
        {
            this.data=data;
        }
    }

    private QueueNode rear=null;
    private QueueNode front=null;

    public void add(int item){
     QueueNode newNode = new QueueNode(item);
     if(isEmpty()){
     rear=newNode;
     front=newNode;
     }
     else{
        rear.next=newNode;
        rear=newNode;
     }
     System.out.println("Added "+item+ " to the queue");
    }

    public int delete()
    {
        if(isEmpty())
        return -1;
        else
        {
            int ans=front.data;
            front=front.next;
            return ans;
        }
    }
    
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return rear.data;
    }

    public boolean isEmpty()
    {
       if(front==null)
       {
        return true;
       }
       return false;
    }

    public static void main(String[] args)
    {
        MyQueue q=new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(" Removed "+q.delete()+ " from the queue");
        System.out.println(" Top element is "+q.peek());
        System.out.println(" Removed "+q.delete()+ " from the queue");
        q.add(40);
        System.out.println(" Top element is "+q.peek());
    }
}
