import romanToInt from "./main";

describe("romanToInt", () => {
  it("should convert int to", () => {
    expect(romanToInt("MCMXCIV")).toBe(1994);
  });

  it("should convert int to", () => {
    expect(romanToInt("CMXCIX")).toBe(999);
  });

  it("should convert int to", () => {
    expect(romanToInt("CDXLIV")).toBe(444);
  });
});
