function strStr(haystack: string, needle: string): number {
  let index = -1;
  if (needle == "") {
    return 0;
  }
  for (let i = 0; i < haystack.length; i++) {
    let j = 0;
    while (haystack.charAt(i + j) == needle.charAt(j)) {
      if (j == needle.length - 1) {
        index = i;
        return index;
      }
      j++;
    }
  }
  return index;
}

export default strStr;
