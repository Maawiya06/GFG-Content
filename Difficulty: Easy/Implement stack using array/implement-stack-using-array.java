class MyStack {

    int[] arr = new int[1000];
    int top = -1;
    
    public void push(int x) {
        // code here
        if(top == arr.length - 1){
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if(top == -1){
            return -1;
        }
        int popped = arr[top];
        top--;
        return popped;
        // code here
    }
}
