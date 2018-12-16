import isValid from "./main";

describe("isValid", () => {
  it("should return", () => {
    expect(isValid("()")).toBe(true);
  });

  it("should return", () => {
    expect(isValid("()[]{}")).toBe(true);
  });

  it("should return", () => {
    expect(isValid("(]")).toBe(false);
  });

  it("should return", () => {
    expect(isValid("([)]")).toBe(false);
  });

  it("should return", () => {
    expect(isValid("{[]}")).toBe(true);
  });
});
