// @flow
function isPalindrome(x: number): boolean {
  let s = x.toString();
  let e = Math.floor(s.length / 2);
  for (let i = 0; i < e; i++) {
    if (s.charAt(i) != s.charAt(s.length - i - 1)) {
      return false;
    }
  }
  return true;
}

export default isPalindrome;
