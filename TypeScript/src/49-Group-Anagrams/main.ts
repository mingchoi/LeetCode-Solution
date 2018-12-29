import strStr from "../28-Implement-strStr/main";

function groupAnagrams(strs: string[]): string[][] {
  let hash: { [s: string]: string[] } = {};
  for (let i = 0; i < strs.length; i++) {
    let key = strs[i].split("").sort().join("");
    if (!hash[key]) {
      hash[key] = [strs[i]];
    } else {
      hash[key].push(strs[i]);
    }
  }
  let result: string[][] = [];
  for (let k in hash) {
    result.push(hash[k]);
  }
  return result
}

export default groupAnagrams;