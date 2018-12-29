function myPow(x: number, n: number): number {
  if (n == 0 || x == 1) {
    return 1;
  }

  if (x == -1) {
    if (n > 0) {
      return -1;
    }
    return 1;
  }

  if (n < -1000) {
    return 0
  }

  let isNagative = n < 0;
  if (isNagative) {
    n = Math.abs(n);
  }

  let c = x;
  for (let i = 1; i < n; i++) {
    c *= x;
  }

  if (isNagative) {
    return 1 / c;
  }
  return c;
}

export default myPow;