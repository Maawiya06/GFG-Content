class Tree {
    
    int findNodecount(Node root) {
        if (root == null) return 0;
        return 1 + findNodecount(root.left) + findNodecount(root.right);
    }

    float MorrisInorder(Node root, int n) {
        int i = 0;
        int odd1 = (n + 1) / 2, oddval1 = -1;
        int even1 = n / 2, even1val = -1;
        int even2 = n / 2 + 1, even2val = -1;
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                i++;
                if (i == odd1) oddval1 = curr.data;
                if (i == even1) even1val = curr.data;
                if (i == even2) even2val = curr.data;
                curr = curr.right;
            } else {
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    i++;
                    if (i == odd1) oddval1 = curr.data;
                    if (i == even1) even1val = curr.data;
                    if (i == even2) even2val = curr.data;
                    curr = curr.right;
                }
            }
        }

        float median = 0;
        if (n % 2 == 0) {
            // even
            median = (even1val + even2val) / 2.0f;
        } else {
            median = oddval1;
        }

        return median;
    }

    public static float findMedian(Node root) {
        Tree t = new Tree();
        int n = t.findNodecount(root);
        return t.MorrisInorder(root, n);
    }
}
