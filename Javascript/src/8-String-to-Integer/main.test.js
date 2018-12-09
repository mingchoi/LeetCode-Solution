import myAtoi from "./main";

describe("myAtoi", () => {
  it("should convert", () => {
    expect(myAtoi("123")).toBe(123);
  });

  it("should convert", () => {
    expect(myAtoi("-123")).toBe(-123);
  });

  it("should convert", () => {
    expect(myAtoi("   456   ")).toBe(456);
  });

  it("should convert", () => {
    expect(myAtoi("+123")).toBe(123);
  });

  it("should convert", () => {
    expect(myAtoi("words and 987")).toBe(0);
  });

  it("should convert", () => {
    expect(myAtoi("-91283472332")).toBe(-2147483648);
  });

  it("should convert", () => {
    expect(myAtoi("  +0 123")).toBe(0);
  });
});
