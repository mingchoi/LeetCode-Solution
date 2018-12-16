function romanFormatter(
  one: string,
  five: string,
  ten: string,
  value: string
): string {
  switch (value) {
    case "1":
      return one;
    case "2":
      return one + one;
    case "3":
      return one + one + one;
    case "4":
      return one + five;
    case "5":
      return five;
    case "6":
      return five + one;
    case "7":
      return five + one + one;
    case "8":
      return five + one + one + one;
    case "9":
      return one + ten;
  }
  return "";
}

class RomanCharSet {
  one: string;
  five: string;
  ten: string;

  constructor(o: string, f: string, t: string) {
    this.one = o;
    this.five = f;
    this.ten = t;
  }

  asArray(): [string, string, string] {
    return [this.one, this.five, this.ten];
  }
}

let charList: RomanCharSet[] = [
  new RomanCharSet("I", "V", "X"),
  new RomanCharSet("X", "L", "C"),
  new RomanCharSet("C", "D", "M"),
  new RomanCharSet("M", "?", "?")
];

function intToRoman(num: number): string {
  let nums = num
    .toString()
    .split("")
    .reverse();
  let result = [];
  for (let i in nums) {
    result.push(
      romanFormatter(
        charList[i].one,
        charList[i].five,
        charList[i].ten,
        nums[i]
      )
    );
  }
  return result.reverse().join("");
}

export default intToRoman;
