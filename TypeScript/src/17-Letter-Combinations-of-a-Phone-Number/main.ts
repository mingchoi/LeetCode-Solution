let result: string[] = [];
function r(digits: string, pos: number, str: string) {
  if (pos >= digits.length) {
    result.push(str);
    return;
  }
  switch (digits.charAt(pos)) {
    case "2":
      r(digits, pos + 1, str + "a");
      r(digits, pos + 1, str + "b");
      r(digits, pos + 1, str + "c");
      break;
    case "3":
      r(digits, pos + 1, str + "d");
      r(digits, pos + 1, str + "e");
      r(digits, pos + 1, str + "f");
      break;
    case "4":
      r(digits, pos + 1, str + "g");
      r(digits, pos + 1, str + "h");
      r(digits, pos + 1, str + "i");
      break;
    case "5":
      r(digits, pos + 1, str + "j");
      r(digits, pos + 1, str + "k");
      r(digits, pos + 1, str + "l");
      break;
    case "6":
      r(digits, pos + 1, str + "m");
      r(digits, pos + 1, str + "n");
      r(digits, pos + 1, str + "o");
      break;
    case "7":
      r(digits, pos + 1, str + "p");
      r(digits, pos + 1, str + "q");
      r(digits, pos + 1, str + "r");
      r(digits, pos + 1, str + "s");
      break;
    case "8":
      r(digits, pos + 1, str + "t");
      r(digits, pos + 1, str + "u");
      r(digits, pos + 1, str + "v");
      break;
    case "9":
      r(digits, pos + 1, str + "w");
      r(digits, pos + 1, str + "x");
      r(digits, pos + 1, str + "y");
      r(digits, pos + 1, str + "z");
      break;
  }
}

function letterCombinations(digits: string): string[] {
  if (digits.length == 0) {
    return [];
  }
  result = [];
  r(digits, 0, "");
  return result;
}

export default letterCombinations;
