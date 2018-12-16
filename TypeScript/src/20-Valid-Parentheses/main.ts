var isValid = function(s: string): boolean {
  let stack = [];
  for (let i = 0; i < s.length; i++) {
    let c = s.charAt(i);
    if (c == "(" || c == "[" || c == "{") {
      stack.push(c);
    } else if (c == ")" && stack.pop() != "(") {
      return false;
    } else if (c == "]" && stack.pop() != "[") {
      return false;
    } else if (c == "}" && stack.pop() != "{") {
      return false;
    }
  }
  if (stack.length != 0) {
    return false;
  }
  return true;
};

export default isValid;
