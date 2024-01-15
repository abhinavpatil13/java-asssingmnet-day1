class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
         
         for(int i=0;i<arr.length;i++){
             
             for(int j=1; j<arr.length;j++){
                 
                 if(arr[i]+arr[j]==x){
                     return true;
                 }
             }
         }
         return false;
    }
}