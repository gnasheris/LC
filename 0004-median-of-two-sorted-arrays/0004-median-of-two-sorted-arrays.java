class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // you would have two pointers?
        int max = nums1.length + nums2.length;
        int i = 0;  // points to nums 1
        int j = 0; // points to nums 2

        ArrayList<Integer> result = new ArrayList<>(max);

        while ((i < nums1.length) && (j < nums2.length)) {
            if (nums1[i] <= nums2[j]) {
                result.add(nums1[i]);
                i++;
            }
            else {
                result.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            result.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            result.add(nums2[j]);
            j++;
        }

        if (result.size() % 2 == 0) {
            int a = (result.size() - 1) / 2;
            int b = (result.size() - 1)/ 2 + 1;
            return (result.get(a) + result.get(b)) / 2.0;

        } else {
            System.out.println(result.size());
            return result.get(result.size() / 2);
        }
        
    }


}