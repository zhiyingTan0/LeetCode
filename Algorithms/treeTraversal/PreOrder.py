# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def preOrder(root,list):
    if root != None:
        list.append(root.val)
        list=preOrder(root.left,list)
        list=preOrder(root.right,list)
    return list
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        #print(list)
        return preOrder(root,[])
