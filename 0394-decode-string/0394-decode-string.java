class Solution {

    // int i = 0;

    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder(); 
        int num = 0;

        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if(ch == '[') {
                countStack.push(num);
                stringStack.push(curr);

                curr = new StringBuilder();
                num = 0;
            }
            else if(ch == ']') {
                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();

                prev.append(curr.toString().repeat(count));

                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }

        return curr.toString();


        // ================= Using recursion =================

        // StringBuilder sb = new StringBuilder();

        // while(i < s.length() && s.charAt(i) != ']') {
        //     char ch = s.charAt(i);

        //     if(Character.isDigit(ch)) {
        //         int num = 0;

        //         while(i < s.length() && Character.isDigit(s.charAt(i))) {
        //             num = num * 10 + (s.charAt(i) - '0');
        //             i++;
        //         }

        //         i++;

        //         String str = decodeString(s);

        //         i++;

        //         sb.append(str.repeat(num));
        //     } else {
        //         sb.append(ch);
        //         i++;
        //     }
        // }

        // return sb.toString();
    }
}