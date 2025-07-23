/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

class Solution {
    // Helper function to return a pair (height, sum)
    Pair<Integer, Integer> height(Node root) {
        if (root == null) return new Pair<>(0, 0);

        Pair<Integer, Integer> lh = height(root.left);
        Pair<Integer, Integer> rh = height(root.right);

        int sum = root.data;
        if (lh.getKey().equals(rh.getKey())) {
            sum += Math.max(lh.getValue(), rh.getValue());
        } else if (lh.getKey() > rh.getKey()) {
            sum += lh.getValue();
        } else {
            sum += rh.getValue();
        }

        return new Pair<>(Math.max(lh.getKey(), rh.getKey()) + 1, sum);
    }

    public int sumOfLongRootToLeafPath(Node root) {
        return height(root).getValue();
    }
}
