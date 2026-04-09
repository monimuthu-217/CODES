class MyStack 
{
    Queue<Integer> Q1;
    public MyStack() 
    {
        Q1 = new ArrayDeque<>();
    }
    public void push(int x) 
    {
        Q1.offer(x);

        for(int i = 0; i < Q1.size()-1; i++)
        {
            Q1.offer(Q1.poll());
        }
        
    }
    public int pop() 
    {
        int iValue = Q1.poll();
        return iValue;
    }
    public int top() 
    {
        int iValue = Q1.peek();
        return iValue;
        
    }
    public boolean empty() 
    {
        return Q1.isEmpty();
    }
}
