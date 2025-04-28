class Solution {
    public int[] productExceptSelf(int[] nums) {
        // brute force approach
        // create a prefix array at the start 
        int max = nums.length;
        int[] suffixarr = new int[max];
        int[] prefixarr = new int[max];
        int [] total = new int[max];

        for (int i = 0; i < max; i++) {
            // making the prefix array
            if (i == 0) {
                prefixarr[0] = 1;
                suffixarr[max-1] = 1;
            }

            else {
                prefixarr[i] = prefixarr[i - 1] * nums[i - 1];
                suffixarr[(max + - 1) - i] = suffixarr[max - i] * nums[max - i];
            }
            
        }

        for (int i = 0; i < max; i++) {
            total[i] = prefixarr[i] * suffixarr[i];
        }

        return total;
    }
}