/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s: string) {
  let max = 0;
  let arr: Array<String> = [];
  for (let i = 0; i < s.length; i++) {
    if (arr.indexOf(s[i]) !== -1) {
      arr = arr.slice(arr.indexOf(s[i]) + 1, arr.length);
    }
    arr.push(s[i]);
    if (arr.length > max) {
      max = arr.length;
    }
  }
  return max;
};
export default lengthOfLongestSubstring;
