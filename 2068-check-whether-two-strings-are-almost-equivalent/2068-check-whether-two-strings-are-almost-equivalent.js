/**
 * @param {string} word1
 * @param {string} word2
 * @return {boolean}
 */
var checkAlmostEquivalent = function(word1, word2) {
    var arr = new Array(26).fill(0) , arr1 = new Array(26).fill(0) ;
    for(let i = 0 ; i < word1.length ; i++){
        arr[word1.charCodeAt(i) - 97] += 1;
        arr1[word2.charCodeAt(i) - 97] += 1;
    }

    for(let i = 0 ; i < 26 ; i++){
        if(Math.abs(arr[i] - arr1[i]) > 3){
            return false;
        }
    }
    
    return true;
};