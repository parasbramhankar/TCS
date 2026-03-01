package recursion;


/*
-----------------------------------------------
PROBLEM: Generate Parentheses
-----------------------------------------------

We are given an integer n.
We need to generate all combinations of well-formed (valid) parentheses
using exactly n opening '(' and n closing ')'.

-----------------------------------------------
APPROACH: Backtracking
-----------------------------------------------

This problem is solved using RECURSION + BACKTRACKING.

We build the string step by step and make decisions at each step:
- Add '('
- Add ')'

But we must follow 2 IMPORTANT RULES to keep the parentheses valid:

1️⃣ We can add '(' only if open < n
   (Because we can use maximum n opening brackets)

2️⃣ We can add ')' only if close < open
   (Because we cannot close more brackets than we have opened)

-----------------------------------------------
LOGIC FLOW
-----------------------------------------------

We maintain:
- StringBuilder str → current string being built
- open → number of '(' used
- close → number of ')' used
- n → total pairs required
- ans → list to store final valid combinations

Base Case:
If str.length() == 2 * n
→ That means we used all brackets
→ Add string to answer list
→ Return

Recursive Case:

Step 1:
If open < n
→ Add '('
→ Call recursion
→ Backtrack (remove last character)

Step 2:
If close < open
→ Add ')'
→ Call recursion
→ Backtrack (remove last character)

-----------------------------------------------
WHY BACKTRACKING?
-----------------------------------------------

After exploring one possibility,
we remove the last added character
so we can explore other possible combinations.

This ensures all valid combinations are generated.

-----------------------------------------------
TIME COMPLEXITY
-----------------------------------------------

O(2^n) approx
(Actually equal to Catalan Number count)

-----------------------------------------------
SPACE COMPLEXITY
-----------------------------------------------

O(n) recursion stack
-----------------------------------------------
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {

    public static void generateParenthesis(List<String>list,int n,StringBuilder sb,int open,int close){
        if(sb.length()==2*n){
            list.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append("(");
            generateParenthesis(list,n,sb,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            generateParenthesis(list,n,sb,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        generateParenthesis(list,n,sb,0,0);


        System.out.println(list);
    }
}
