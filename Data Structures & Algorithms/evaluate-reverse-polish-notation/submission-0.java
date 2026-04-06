class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        
        for (String token : tokens) {
           
            if (token.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b + a); 
            } else if (token.equals("-")) {
                int b = st.pop(); // The second operand (b)
                int a = st.pop(); // The first operand (a)
                st.push(a - b); // Must be a - b
            } else if (token.equals("*")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b * a);
            } else if (token.equals("/")) {
                int b = st.pop(); // The divisor (b)
                int a = st.pop(); // The dividend (a)
                st.push(a / b); // Must be a / b
            } else {
                // 3. If it's not an operator, it's a number.
                //    Parse the STRING, not a char, and push it.
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
    }

