<h2><a href="https://www.geeksforgeeks.org/problems/count-the-reversals0401/1">Count the Reversals</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a string <strong>s</strong> consisting of only opening and closing curly brackets<strong> '{'</strong> and<strong> '}',</strong>&nbsp;find out the <strong>minimum&nbsp;</strong>number of reversals required to convert the string into a balanced expression. A reversal means changing&nbsp;<strong>'{'</strong>&nbsp;to&nbsp;<strong>'}'</strong>&nbsp;or vice-versa.<br><br></span><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "}{{}}{{{"
<strong>Output:</strong> 3
<strong>Explanation</strong>: One way to balance is:
"<strong>{</strong>{{}}{<strong>}}</strong>". There is no balanced sequence
that can be formed in lesser reversals.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s = "{{}{{{}{{}}{{"</span><span style="font-size: 18px;">
<strong>Output:</strong> -1
<strong>Explanation</strong>: There's no way we can balance
this sequence of braces.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;