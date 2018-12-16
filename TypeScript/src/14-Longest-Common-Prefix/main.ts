function longestCommonPrefix(strs: string[]): string {
  let result = "";
  let index = 0;
  if (strs.length == 0) {
    return result;
  }

  for (let k = 0; k < strs[0].length; k++) {
    let c = strs[0].charAt(index);
    for (let i = 1; i < strs.length; i++) {
      if (strs[i].charAt(index) != c) {
        return result;
      }
    }
    result += c;
    index++;
  }
  return result;
}

export default longestCommonPrefix;
