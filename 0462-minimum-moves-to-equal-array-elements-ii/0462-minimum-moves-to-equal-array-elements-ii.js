/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves2 = function(nums) {
    nums.sort(function(a , b) {return a - b});
    const a = nums[Math.floor(nums.length / 2)];
    let ans = 0 ;
    for(let n of nums){
        ans += Math.abs(a - n);
    }
    return ans;
};