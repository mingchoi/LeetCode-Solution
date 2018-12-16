let result: string[] = [];
function generateParenthesis(n: number): string[] {
  result = [];
  r(n, 0, 0, "");
  return result;
}

function r(max: number, i: number, lv: number, str: string) {
  if (i == max) {
    for (let j = 0; j < lv; j++) {
      str += ")";
    }
    result.push(str);
    return;
  }
  if (i == 0) {
    r(max, i + 1, lv + 1, str + "(");
  } else {
    r(max, i + 1, lv + 1, str + "(");
    if (lv > 0) {
      r(max, i, lv - 1, str + ")");
    }
  }
}

export default generateParenthesis;
