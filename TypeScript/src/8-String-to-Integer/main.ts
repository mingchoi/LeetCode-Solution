// @flow
function myAtoi(str: string): number {
  str = str.trim();
  let result = parseInt(str, 10);
  if (
    str.charAt(0) != "-" &&
    str.charAt(0) != "+" &&
    isNaN(parseInt(str.charAt(0), 10))
  ) {
    return 0;
  }
  if (isNaN(result)) {
    return 0;
  }
  if (result > 2147483647) {
    return 2147483647;
  }
  if (result < -2147483648) {
    return -2147483648;
  }
  return result;
}

export default myAtoi;
