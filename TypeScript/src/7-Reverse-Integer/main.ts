// @flow
function reverse(x: number): number {
  if (x > 2147483647 || x < -2147483648) {
    return 0;
  }
  let s = x.toString();
  let prefix = "";
  if (s.charAt(0) == "-") {
    prefix = "-";
    s = s.slice(1, s.length);
  }
  let result = parseInt(
    prefix +
      s
        .split("")
        .reverse()
        .join("")
  );
  if (result > 2147483647 || result < -2147483648) {
    return 0;
  }
  return result;
}

export default reverse;
