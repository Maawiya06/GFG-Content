<h2><a href="https://www.geeksforgeeks.org/problems/transform-to-sum-tree/1?page=4&category=Tree&sortBy=submissions">Transform to Sum Tree</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree of size N , where each node can have positive or negative values. Convert this to a tree where each node contains the sum of the left and right sub trees of the original tree. The values of leaf nodes are changed to 0.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
             10
          /      \
        -2        6
       /   \     /  \
     8     -4   7    5</span>

<span style="font-size:18px"><strong>Output:</strong>
            20
          /    \
        4        12
       /  \     /  \
     0     0   0    0</span>

<strong><span style="font-size:18px">Explanation:</span></strong>

<span style="font-size:18px">           (4-2+12+6)
          /           \
      (8-4)          (7+5)
       /   \         /  \
      0     0       0    0</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You dont need to read input or print anything. Complete the function<strong> toSumTree()</strong> which takes root node as input parameter and modifies the given tree in-place.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong> If you click on Compile and Test the output will be the in-order traversal of the modified tree.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(height of tree)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N&nbsp;≤ 10<sup>4</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>FactSet</code>&nbsp;<code>Walmart</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;