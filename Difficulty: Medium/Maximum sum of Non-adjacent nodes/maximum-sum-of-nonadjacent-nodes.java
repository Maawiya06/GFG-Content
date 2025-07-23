/*class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/
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
    Pair<Integer, Integer> getMaxSum_helper(Node root) {
        if (root == null) return new Pair<>(0, 0);

        Pair<Integer, Integer> left = getMaxSum_helper(root.left);
        Pair<Integer, Integer> right = getMaxSum_helper(root.right);

        // sum including the node
        int a = root.data + left.getValue() + right.getValue();

        // sum excluding the root
        int b = Math.max(left.getKey(), left.getValue()) + Math.max(right.getKey(), right.getValue());

        return new Pair<>(a, b);
    }

    // Function to return the maximum sum of non-adjacent nodes.
    public int getMaxSum(Node root) {
        Pair<Integer, Integer> result = getMaxSum_helper(root);
        return Math.max(result.getKey(), result.getValue());
    }
}
