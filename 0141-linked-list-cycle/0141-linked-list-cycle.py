# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        #assigning head to slow and fast 
        slow, fast = head, head

        while fast and fast.next:
            #slow increments by 1
            slow = slow.next

            #fast increments by double
            fast = fast.next.next

            #if slow and fast meet, then there is a cycle
            if slow == fast:
                return True

        return False