/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findPeak(MountainArray arr , int start , int end){
        while(start < end){
            int mid = start + (end - start) / 2 ;

            if(arr.get(mid) > arr.get(mid + 1)){
                end = mid ;
            }else{
                start = mid + 1 ;
            }
        }
        return start ;
    }
    public int binarySearch(MountainArray arr , int target , int start , int end , boolean isAsc){
        while(start <= end){
            int mid = (start + end) / 2 ;
            int midValue = arr.get(mid) ;
            if(midValue == target){
                return mid ;
            }

            if(isAsc){
                if(midValue < target){
                    start = mid + 1 ;
                }else{
                    end = mid - 1 ;
                }
            }else{
                if(midValue > target){
                    start = mid + 1 ;
                }else{
                    end = mid - 1 ;
                }
            }
        }
        return -1 ;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length() - 1 ;
        int peak = findPeak(mountainArr , 0 , len) ;
        int firstTry = binarySearch(mountainArr , target , 0 , peak , true);
        if(firstTry != -1){
            return firstTry ;
        }
        return binarySearch(mountainArr , target , peak + 1 , mountainArr.length() - 1 , false);
    }
}