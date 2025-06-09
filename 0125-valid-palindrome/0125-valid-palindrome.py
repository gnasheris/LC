class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = s.replace(" ", "")
        s = ''.join(c for c in s if c.isalnum())
        s = s.lower()
        print(s)
        if (len(s) % 2 == 0):
            mid = len(s) // 2
        else:
            mid = (len(s) // 2) 
            mid += 1
        list1 = ""
        for i in s[mid:]:
            list1 += i
        list1 = list1[::-1]
        if (len(s) % 2 != 0):
            mid -= 1
        if (list1 == s[:mid]):
            return True
        return False