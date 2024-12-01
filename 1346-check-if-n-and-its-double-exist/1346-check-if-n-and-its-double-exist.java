class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            for(int j = 0 ; j < arr.length ; j++){
                if(i != j){
                    if(arr[i] == 2 * arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}