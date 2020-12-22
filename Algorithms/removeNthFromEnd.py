# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        ptr0=ptr1=head
        # n= length of list
        for i in range(n):
            ptr0=ptr0.next
        if ptr0==None:
            return head.next
        
        while ptr0.next:
            ptr0=ptr0.next
            ptr1=ptr1.next
        ptr1.next=ptr1.next.next
        
        return head
        
        
        
            
        
        ''''
        # method 2
        length =1
        ptr=head
        while True:
            ptr=ptr.next
            if ptr != None:
                length=length+1
            else:
                break
        index=length-n
        print(index)
        if index==0:
            return head.next
        else:
            
            newhead=ListNode(head.val,None)
            ptr=newhead
            i=1
            head=head.next
            while i <length:
                if i==index:
                    head=head.next
                    i=i+1
                    if i >=length:
                        return ptr
               
                tmp=ListNode(head.val,None)
                newhead.next=tmp
                newhead=newhead.next

                head=head.next
                i=i+1
            return ptr
            '''
        
