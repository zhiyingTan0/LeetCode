# check same diagonal cases
# diagonal cases: row_diff=col_diff
# check all the previous row
    
def isValid(board, row,col):
    for i in range(row):
        if abs(row-i)==abs(col-board[i]):
            return False
    return True
    
def backTracking(board,n,row,acc):
       
        for col in range(n):
            # skip same row same column cases
            if col not in board:
                if(isValid(board,row,col)):
                    board[row]=col
                    if row<n-1:
                        acc=backTracking(board,n,row+1,acc)
                    else:
                        acc=acc+1
                       
                else:
                    continue
            
        # after checking all the cases in current row
        # go back to pervious row 
        # set the board[current row ]= -1   
        board[row]=-1
        return acc
        
class Solution:
    # check same diagonal cases
    # diagonal cases: row_diff=col_diff
    # check all the previous row
              
      
    def totalNQueens(self, n: int) -> int:
        board=[-1 for i in range(n)]
        return backTracking(board,n,0,0)
        
