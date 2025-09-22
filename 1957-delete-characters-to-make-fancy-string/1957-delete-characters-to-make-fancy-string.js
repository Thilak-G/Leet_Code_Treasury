/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function(s) {
    if(s.length <= 2){
        return s;
    }
    let ans = "" + s.charAt(0) ;
    for(let i = 1 ; i < s.length - 1 ; i++){
        if(s.charAt(i) === s.charAt(i - 1) && s.charAt(i) === s.charAt(i + 1)){
            continue ;
        }
        ans += s.charAt(i);
    }
    return ans + s.charAt(s.length - 1);
};