class Solution {
    public int[] getNumber(String version, int index){
        int j = index;
        while(j<=version.length()-1 && version.charAt(j)!='.'){
            j=j+1;
        }
        
        int num = Integer.parseInt(version.substring(index,j));
        index=j+1;
        int[] arr = {index,num};
        return arr;
    }
    public int compareVersion(String version1, String version2) {
        int index1=0;
        int index2=0;
        //arr[0] is index and arr[1] is revision number
        int[] arr1;
        int[] arr2;
        while(index1<=version1.length()-1 && index2<=version2.length()-1){
           
            arr1=getNumber(version1,index1);
            index1=arr1[0];
         
            
            arr2=getNumber(version2,index2);
            index2=arr2[0];
            
            
            if(arr1[1]>arr2[1]){
                return 1;
            }else if (arr2[1]>arr1[1]){
                return -1;
            }
        }
        
        while(index1<=version1.length()-1){
            arr1=getNumber(version1,index1);
            index1=arr1[0];
            
            if(arr1[1]>0){
                return 1;
            }
            
        }
        while(index2<=version2.length()-1){
            arr2=getNumber(version2,index2);
            index2=arr2[0];
            //System.out.println("num2:"+arr2[1]+" index2:"+arr2[0]);
            if(arr2[1]>0){
                return -1;
            }
            
        }
        
        return 0;
        
    }
}
