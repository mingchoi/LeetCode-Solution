function divide(dividend: number, divisor: number): number {
  var a = Math.abs(dividend);
  var b = Math.abs(divisor);
  var i = 0;
  var count = b;

  if (dividend == divisor) {
    return 1;
  } else if (dividend == -divisor) {
    return -1;
  }

  while (count <= a) {
    count += b;
    i++;
  }

  if ((dividend < 0 || divisor < 0) && !(dividend < 0 && divisor < 0)) {
    i = -i;
  }

  if (i >= 2147483648) {
    return 2147483647;
  }

  return i;
}

export default divide;
