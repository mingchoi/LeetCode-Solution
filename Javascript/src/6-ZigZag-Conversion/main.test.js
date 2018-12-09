import convert from "./main";

describe("convert", () => {
  it("should convert", () => {
    expect(convert("PAYPALISHIRING", 3)).toBe("PAHNAPLSIIGYIR");
  });

  it("should convert", () => {
    expect(convert("PAYPALISHIRING", 4)).toBe("PINALSIGYAHRPI");
  });

  it("should convert", () => {
    expect(convert("A", 1)).toBe("A");
  });

  it("should convert", () => {
    expect(convert("AB", 1)).toBe("AB");
  });

  it("should convert", () => {
    expect(convert("ABC", 2)).toBe("ACB");
  });
});
