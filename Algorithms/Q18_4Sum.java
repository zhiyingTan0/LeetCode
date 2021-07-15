class Solution {
    //public 
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();  
        Arrays.sort(nums);
        int r =nums.length-1;
        if(r+1<=3){return output;}
        int l=0;
        int l1=-1;
        int r1=-1;
        //for each l,check all possible cases
        while(l+3<=nums.length-1){
            while(l<r){
                l1=l+1;
                r1=r-1;
                while(l1<r1){
                    if(nums[l]+nums[r]+nums[l1]+nums[r1]==target){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[l]);
                        tmp.add(nums[l1]);
                        tmp.add(nums[r]);
                        tmp.add(nums[r1]);
                        output.add(tmp);
                        // update the index of l1 and r1 to move on to next step
                        // also avoid same cases in output[][]
                        while(l1+1<=nums.length-1 && nums[l1]==nums[l1+1]){
                            l1=l1+1;
                        }
                        while(r1-1>=0 && nums[r1]==nums[r1-1]){
                            r1=r1-1;
                        }
                        l1=l1+1;
                        r1=r1-1;

                    }
                    else if(nums[l]+nums[r]+nums[l1]+nums[r1]>target){
                        r1=r1-1;
                    }else{
                        l1=l1+1;
                    }

                }
               
                while(r-1>=0 &&nums[r]==nums[r-1]){
                    r=r-1;
                }

                //l=l+1;
                r=r-1;
            }
            while (l+1<=nums.length-1 && nums[l]==nums[l+1]){
                    l=l+1;
            }
            l=l+1;
            r=nums.length-1;
        }
        
        return output;
    }
}
