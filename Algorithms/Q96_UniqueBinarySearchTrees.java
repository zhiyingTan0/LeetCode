class Solution {
    public int numTrees(int n) {
        // idea: all combination of previous trees
        //for example: when n=5
        // Either Add a root to the tree of size 4(this tree then become left subtress) or add a right leaf to the tree of size 4
        // it could also be consisted of the subtree A,B and C (A is 1, B is 5 and C is 234) where subtree A always < subtree C and B is always the right child of A
        // tree of 12 , 5 and  34
        // tree of 123 , 5 and 4
        
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] array = new int[n];
        array[0]=1;
        array[1]=2;
        for(int i=2; i<n;i++){
            array[i]=array[i-1]*2;
            //space between = i-1
            int numSpace =i-1;
            for(int j=0; j<numSpace;j++){
                array[i]=array[i]+array[numSpace-j-1]*array[j];
            }
        }
        
        
        
        return array[n-1];
        
    }
}
