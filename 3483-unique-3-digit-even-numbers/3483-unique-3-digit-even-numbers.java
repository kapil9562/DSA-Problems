class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        for(int first = 1; first <= 9; first++) {
            if(freq[first] == 0) continue;

            freq[first]--;

            for(int second = 0; second <= 9; second++) {
                if(freq[second] == 0) continue;

                freq[second]--;

                for(int third = 0; third <= 8; third += 2) {
                    if(freq[third] > 0) {
                        count++;
                    }
                }

                freq[second]++;
            }

            freq[first]++;
        }

        return count;
    }
}