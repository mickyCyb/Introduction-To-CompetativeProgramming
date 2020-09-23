class StockSpanner {

    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    int span;
    public int next(int price) {
        span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span+= stack.pop()[1];
            //System.out.println(stack.peek()[0]+ " "+stack.peek()[1]);
        }
        stack.add(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */