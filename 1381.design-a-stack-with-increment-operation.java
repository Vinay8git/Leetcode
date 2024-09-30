/*
 * @lc app=leetcode id=1381 lang=java
 *
 * [1381] Design a Stack With Increment Operation
 */

// @lc code=start
class CustomStack {
    List<Integer> stack;
    int top;
    public CustomStack(int maxSize) {
        stack=new ArrayList<>();
        top=maxSize;
    }
    
    public void push(int x) {
        if(stack.size() != top)
            stack.add(x);
    }
    
    public int pop() {
        if(stack.size()!=0)
            return stack.remove(stack.size()-1);
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<stack.size() && i<k;i++)
        {
            stack.set(i, stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
// @lc code=end

