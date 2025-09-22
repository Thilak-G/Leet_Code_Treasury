/**
 * @param {string} n
 * @return {number}
 */
var minPartitions = function(n) {
    let max = 0 ;
    for(let a of n){
        max = Math.max(a - '0' , max);
    }
    return max;
};