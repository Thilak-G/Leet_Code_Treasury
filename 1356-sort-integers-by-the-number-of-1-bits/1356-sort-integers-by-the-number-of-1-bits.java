class Solution {
    public int IntToBit(String str){
        int count = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = IntToBit(Integer.toBinaryString(arr[i])) ;
            max = Math.max(max , ans[i]) ;
        }
        int[] fi = new int[arr.length] ;
        int a = 0 ;
        boolean[] bo = new boolean[arr.length] ;
        for(int i = 0 ; i <= max ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(ans[j] == i && !bo[j]){
                    bo[j] = true;
                    fi[a] = arr[j] ;
                    a++;
                }
            }
        }
        return fi;
    }
}