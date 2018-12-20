function r(n: number): string {
  if (n == 1) {
    return "1";
  }

  let str = r(n - 1);
  let result = "";
  let c = str.charAt(0);
  let count = 0;
  for (let i = 1; i <= str.length; i++) {
    if (str.charAt(i) == c) {
      count++;
    } else {
      count++;
      result += count + c;
      c = str.charAt(i);
      count = 0;
    }
  }
  return result;
}

function countAndSay(n: number): string {
  return r(n);
}

export default countAndSay;
