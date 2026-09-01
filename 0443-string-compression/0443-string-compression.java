class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read < chars.length) {
            char ch = chars[read];
            int count = 0;
            while(read < chars.length && chars[read] == ch) {
                read++;
                count++;
            }

            chars[write++] = ch;

            if(count > 1) {
                String num = String.valueOf(count);

                for(char c : num.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}