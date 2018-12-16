import intToRoman from "./main";

describe("intToRoman", () => {
  it("should convert int to", () => {
    expect(intToRoman(1)).toBe("I");
  });

  it("should convert int to", () => {
    expect(intToRoman(4)).toBe("IV");
  });

  it("should convert int to", () => {
    expect(intToRoman(8)).toBe("VIII");
  });

  it("should convert int to", () => {
    expect(intToRoman(100)).toBe("C");
  });

  it("should convert int to", () => {
    expect(intToRoman(99)).toBe("XCIX");
  });

  it("should convert int to", () => {
    expect(intToRoman(9)).toBe("IX");
  });

  it("should convert int to", () => {
    expect(intToRoman(58)).toBe("LVIII");
  });

  it("should convert int to", () => {
    expect(intToRoman(1994)).toBe("MCMXCIV");
  });

  it("should convert int to", () => {
    expect(intToRoman(2018)).toBe("MMXVIII");
  });
});
