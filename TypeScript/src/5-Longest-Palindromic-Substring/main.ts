// @flow

let cache: any = {};
export function isPalindromic(s: string): boolean {
  if (cache[s]) {
    return true;
  }
  let e = Math.floor(s.length / 2);
  for (let i = 0; i < e; i++) {
    if (s.charAt(i) != s.charAt(s.length - i - 1)) {
      return false;
    }
  }
  cache[s] = true;
  return true;
}

function longestPalindrome_v1(s: string): string {
  let max = 0;
  let maxString = "";
  for (let i = 0; i < s.length; i++) {
    for (let j = i; j < s.length; j++) {
      let slice = s.slice(i, j + 1);
      if (isPalindromic(slice)) {
        if (slice.length > max) {
          max = slice.length;
          maxString = slice;
        }
      }
    }
  }
  return maxString;
}

function longestPalindrome_v2(s: string): string {
  let max = 1;
  let maxString = s.charAt(0);
  if (s.charAt(0) == s.charAt(1)) {
    [max, maxString] = [2, s.slice(0, 2)];
  }
  for (let i = 1, end = s.length - 1; i < end; i++) {
    let c1 = -1;
    let c2 = -1;
    if (s.charAt(i) == s.charAt(i + 1)) {
      [c1, c2] = [i, i + 1];
      if (max < 2) {
        [max, maxString] = [2, s.slice(i, i + 2)];
      }
    } else {
      [c1, c2] = [i, i];
    }
    let j = 1;
    while (s.charAt(c1 - j) == s.charAt(c2 + j) && s.charAt(c1 - j) != "") {
      let slice = s.slice(c1 - j, c2 + j + 1);
      if (max < slice.length) {
        maxString = slice;
        max = slice.length;
      }
      j += 1;
    }
    if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i - 1)) {
      [c1, c2] = [i, i];
      let j = 1;
      while (s.charAt(c1 - j) == s.charAt(c2 + j) && s.charAt(c1 - j) != "") {
        let slice = s.slice(c1 - j, c2 + j + 1);
        if (max < slice.length) {
          maxString = slice;
          max = slice.length;
        }
        j += 1;
      }
    }
  }
  return maxString;
}

export default longestPalindrome_v2;
