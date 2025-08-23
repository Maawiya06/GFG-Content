class GfG {
    public void insertElement(Stack<Integer> s, int element) {
        if (s.isEmpty() || element > s.peek()) {
            s.push(element);
            return;
        }

        int temp = s.peek();
        s.pop();
        insertElement(s, element);
        s.push(temp);   
    }

    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) return s;

        int top = s.peek();
        s.pop();

        sort(s);

        insertElement(s, top);
        return s;  
    }
}
