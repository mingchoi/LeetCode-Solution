let list: any = {
  M: 1000,
  D: 500,
  C: 100,
  L: 50,
  X: 10,
  V: 5,
  I: 1
};

function romanToInt(s: string): number {
  let result = 0;
  for (let i = 0; i < s.length; i++) {
    result += list[s.charAt(i)];
  }
  if (s.indexOf("CM") != -1 || s.indexOf("CD") != -1) {
    result -= 200;
  }
  if (s.indexOf("XC") != -1 || s.indexOf("XL") != -1) {
    result -= 20;
  }
  if (s.indexOf("IV") != -1 || s.indexOf("IX") != -1) {
    result -= 2;
  }

  return result;
}

export default romanToInt;
