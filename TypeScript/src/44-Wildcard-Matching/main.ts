function isMatch(s: string, p: string): boolean {
  let char = s.charAt(0);
  let patt = p.charAt(0);
  if (patt == "" && char == "") {
    return true;
  } else if (patt == "" && char != "") {
    return false;
  } else if (char == "") {
    if (patt == "*") {
      return isMatch(s, p.substring(1));
    }
    return false;
  } else if (patt == "*") {
    let i = 0;
    while (p.charAt(i) == "*") {
      i++;
    }
    let skip = isMatch(s, p.substring(i));
    let keep = isMatch(s.substring(1), p);
    let letgo = isMatch(s.substring(1), p.substring(i));
    return skip || keep || letgo;
  } else if (patt == "?" || char == patt) {
    return isMatch(s.substring(1), p.substring(1));
  }
  return false;
}

export default isMatch;
