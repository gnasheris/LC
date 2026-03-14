class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        values = {}

        for index, number in enumerate(nums):
            difference = target - number

            if difference in values:
                return [values[difference], index]
            else:
                values[number] = index
            
        return []
            


        
        