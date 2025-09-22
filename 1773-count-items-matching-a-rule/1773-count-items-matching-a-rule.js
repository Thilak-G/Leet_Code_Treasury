/**
 * @param {string[][]} items
 * @param {string} ruleKey
 * @param {string} ruleValue
 * @return {number}
 */
var countMatches = function(items, ruleKey, ruleValue) {
    const index = ruleKey === "type" ? 0 : ruleKey === "color" ? 1 : 2;
    return items.filter(item => item[index] === ruleValue).length;
};