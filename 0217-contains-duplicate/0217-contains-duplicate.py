class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        d1 = {}
        for i in nums:
            if i not in d1:
                d1[i] = 1
            else:
                d1[i] += 1
                return True
            
        return False